package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
@SessionAttributes("userSession")
public class BuyController {
	User user;
	Product product;
	Purchase purchase;

	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping("/user/buy.do")
	public String handleRequest(
			@ModelAttribute("userSession") UserSession userSession,
			@RequestParam("productNum") int productNum,
			@RequestParam("userId") String userId,
			@RequestParam("salesNum") int salesNum, ModelMap model)
			throws Exception {
		System.out.println("********* " + productNum + ", " + userId + ", "
				+ salesNum);
		product = this.sBuf.getProduct(productNum);
		user = this.sBuf.getUser(userId);
		System.out.println("user userId" + user + ", " + userId);

		// productNum 의 productRemain 을 salesNum 만큼 빼주기
		int productRemain = product.getProductRemain() - salesNum;
		this.sBuf.updateProductRemain(productNum, productRemain);

		// buylistDB에 상품명과 고객id 추가
		this.sBuf.insertPurchase(productNum, userId);

		// userId 의 userPoint 를 productPrice의 10퍼센트 증가
		int userPoint = user.getUserPoint()
				+ (int) (product.getProductPrice() * 0.1);
		System.out.println("****** userPoint :" + userPoint
				+ ", product.getProductPrice() : " + product.getProductPrice()
				+ ", user.getUserPoint() : " + user.getUserPoint());
		this.sBuf.updateUserPoint(userPoint, userId);

		model.put("product", product);
		userSession.setUser(user);
		model.addAttribute("userSession", userSession);
		
		return "AdminSellForm";
	}

	@RequestMapping("/user/buy2.do")
	public String handleRequest2(@RequestParam("productNum") int productNum,
			@RequestParam("userId") String userId,
			@RequestParam("salesNum") int salesNum, ModelMap model)
			throws Exception {
		System.out.println("********* " + productNum + ", " + userId + ", "
				+ salesNum);
		product = this.sBuf.getProduct(productNum);
		user = this.sBuf.getUser(userId);

		// productNum 의 productRemain 을 salesNum 만큼 빼주기
		int productRemain = product.getProductRemain() - salesNum;
		this.sBuf.updateProductRemain(productNum, productRemain);

		// buylistDB에 상품명과 고객id 추가
		this.sBuf.insertPurchase(productNum, userId);

		// userId 의 userPoint 를 productPrice의 10퍼센트 증가
		int userPoint = user.getUserPoint()
				+ (int) (product.getProductPrice() * 0.1);
		System.out.println("****** userPoint :" + userPoint
				+ ", product.getProductPrice() : " + product.getProductPrice()
				+ ", user.getUserPoint() : " + user.getUserPoint());
		this.sBuf.updateUserPoint(userPoint, userId);

		model.put("product", product);
		model.put("user", user);

		if (user != null) {
			UserSession userSession = new UserSession(user);
			model.addAttribute("userSession", userSession);
		}

		return "UserMain";
	}
}
