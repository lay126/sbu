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
	PagedListHolder<Purchase> purchaseList = null;
	PagedListHolder<User> userAll = null;
	Product recoProduct = null;
	private sBuFacade sBuf;

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
						this.sBuf.getPurchaseListByUserId(userAll.getSource()
								.get(i).getUserId()));
				recoProduct = sBuf.getProduct(purchaseList.getSource().get(1)
						.getProductNum());

				model.put("recoAgeProduct", recoProduct);
				int tmpage = Integer.parseInt("19"+userAll.getSource().get(i).getUserBirth().subSequence(0, 2));
				tmpage = 2015-tmpage;
				
				model.put("recoAgeAge", tmpage);
				model.put("recoAgeName", userAll.getSource().get(i).getUserId());
				break;
			}
		}

		// reco by buyList

		model.put("recoBuyProduct",
				productAll.getPageList().get(productAll.getLastElementOnPage()));

		if (user.getUserId().equals("admin")) {
			return "AdminMain";
		} else {
			return "UserMain";
		}

	}
}
