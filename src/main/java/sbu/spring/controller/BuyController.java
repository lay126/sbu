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

	// admin sell
	@RequestMapping("/user/buy.do")
	public String handleRequest(
			@RequestParam("productNum") int productNum,
			@RequestParam("userId") String userId,
			@RequestParam("salesNum") int salesNum, ModelMap model)
			throws Exception {
		System.out.println("*1111******** " + productNum + ", " + userId + ", "
				+ salesNum);
		product = this.sBuf.getProduct(productNum);
		user = this.sBuf.getUser(userId);
		System.out.println("user userId" + user + ", " + userId);

		// productNum 의 productRemain 을 salesNum 만큼 빼주기
		int productRemain = product.getProductRemain() - salesNum;
		this.sBuf.updateProductRemain(productNum, productRemain);
		product = this.sBuf.getProduct(productNum);

		// buylistDB에 상품명과 고객id 추가
		this.sBuf.insertPurchase(productNum, userId);

		// userId 의 userPoint 를 productPrice의 10퍼센트 증가
		int userPoint = user.getUserPoint()
				+ (int) (product.getProductPrice() * 0.1);
		System.out.println("*1111***** userPoint :" + userPoint
				+ ", product.getProductPrice() : " + product.getProductPrice()
				+ ", user.getUserPoint() : " + user.getUserPoint());
		this.sBuf.updateUserPoint(userPoint, userId);

		model.put("product", product);

		return "AdminSellForm";
	}

	// user buy
	@RequestMapping("/user/buy2.do")
	public String handleRequest2(
			@ModelAttribute("userSession") UserSession userSession,
			@RequestParam("productNum") int productNum,
			@RequestParam("userId") String userId,
			@RequestParam("salesNum") int salesNum, ModelMap model)
			throws Exception {
		System.out.println("**2222******* " + productNum + ", " + userId + ", "
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
		System.out.println("**2222**** userPoint :" + userPoint
				+ ", product.getProductPrice() : " + product.getProductPrice()
				+ ", user.getUserPoint() : " + user.getUserPoint());
		this.sBuf.updateUserPoint(userPoint, userId);
		user = this.sBuf.getUser(userId);
		model.put("user", user);
		System.out.println("**3333**** userPoint :" + userPoint
				+ ", product.getProductPrice() : " + product.getProductPrice()
				+ ", user.getUserPoint() : " + user.getUserPoint());
		model.put("product", product);

		// if (user != null) {
		// UserSession userSession = new UserSession(user);
		// model.addAttribute("userSession", userSession);
		// }
		userSession.setUser(user);
		model.put("userSession", userSession);
		return "UserMain";
	}
}
