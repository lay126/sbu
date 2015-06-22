package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.domain.Event;
import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
@SessionAttributes("userSession")
public class LoginController {

	User user = new User();
	PagedListHolder<Event> eventList = null;
	PagedListHolder<Product> productAll = null;
	PagedListHolder<Product> productCateList = null;
	PagedListHolder<Purchase> purchaseList = null;
	PagedListHolder<Purchase> purchaseList2 = null;
	PagedListHolder<User> userAll = null;
	Product recoProduct = null;
	private sBuFacade sBuf;

	int cate1 = 0;
	int cate2 = 0;
	int cate3 = 0;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping("/user/login.do")
	public String handleRequest(HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("userPwd") String userPwd, ModelMap model)
			throws Exception {

		User user = this.sBuf.getUser(userId, userPwd);
		model.put("user", user);

		if (user != null) {
			UserSession userSession = new UserSession(user);
			model.addAttribute("userSession", userSession);
		}

		eventList = new PagedListHolder<Event>(this.sBuf.getEventList());
		model.put("eventList", eventList);

		productAll = new PagedListHolder<Product>(this.sBuf.getProductAll());
		model.put("productAll", productAll);
		model.put("productLastNum", productAll.getNrOfElements());

		userAll = new PagedListHolder<User>(this.sBuf.getUserAll());

		try {
			// reco by newProduct
			for (int i = 0; i < productAll.getNrOfElements(); i++) {
				if (i == productAll.getNrOfElements() - 1) {
					model.put("recoLastProduct", productAll.getSource().get(i));
				}
			}

			// reco by age
			for (int i = 0; i < userAll.getNrOfElements(); i++) {
				if (userAll.getSource().get(i).getUserBirth().subSequence(0, 1)
						.equals(user.getUserBirth().subSequence(0, 1))
						&& (userAll.getSource().get(i).getUserId() != user
								.getUserId())) {

					purchaseList = new PagedListHolder<Purchase>(
							this.sBuf.getPurchaseListByUserId(userAll
									.getSource().get(i).getUserId()));
					recoProduct = sBuf.getProduct(purchaseList.getSource()
							.get(1).getProductNum());

					model.put("recoAgeProduct", recoProduct);
					int tmpage = Integer.parseInt("19"
							+ userAll.getSource().get(i).getUserBirth()
									.subSequence(0, 2));
					tmpage = 2015 - tmpage;

					model.put("recoAgeAge", tmpage);
					model.put("recoAgeName", userAll.getSource().get(i)
							.getUserId());
					break;
				}
			}

			// reco by buyList
			purchaseList2 = new PagedListHolder<Purchase>(
					this.sBuf.getPurchaseListByUserId(userId));

			for (int i = 0; i < purchaseList2.getNrOfElements(); i++) {
				if (purchaseList2.getSource().get(i).getBuyUserId()
						.equals(userId)) {
					if (sBuf.getProduct(
							purchaseList2.getSource().get(i).getProductNum())
							.getProductCateNum() == 1) {
						cate1 += 1;
					} else if (sBuf.getProduct(
							purchaseList2.getSource().get(i).getProductNum())
							.getProductCateNum() == 2) {
						cate2 += 1;
					} else if (sBuf.getProduct(
							purchaseList2.getSource().get(i).getProductNum())
							.getProductCateNum() == 3) {
						cate3 += 1;
					}
				}
			}

			int max;
			if (cate1 >= cate2 && cate1 >= cate3) {
				max = 1;
			} else if (cate2 >= cate3 && cate2 >= cate1) {
				max = 2;
			} else {
				max = 3;
			}

			int remain = 100000;
			productCateList = new PagedListHolder<Product>(
					this.sBuf.getProductListByProductCateNum(max));
			for (int i = 0; i < productCateList.getNrOfElements(); i++) {
				if (remain >= productCateList.getSource().get(i)
						.getProductRemain()) {
					remain = productCateList.getSource().get(i)
							.getProductRemain();
					if (purchaseList2 != null) {
						model.put("recoBuyProduct", productCateList.getSource()
								.get(i));
					}
				}
			}

		} catch (Exception e) {

		}

		if (user.getUserId().equals("admin")) {
			return "AdminMain";
		} else {
			return "UserMain";
		}

	}
}
