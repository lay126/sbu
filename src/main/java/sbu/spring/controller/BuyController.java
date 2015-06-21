package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sbu.spring.domain.Product;
import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
public class BuyController {
	User user;
	Product product;
	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping("/user/buy.do")
	public String handleRequest(@RequestParam("productNum") int productNum,
			@RequestParam("userId") String userId,
			@RequestParam("salesNum") int salesNum, ModelMap model)
			throws Exception {
		product = this.sBuf.getProduct(productNum);
		user = this.sBuf.getUser(userId);

		int productRemain = product.getProductRemain() - salesNum;
		this.sBuf.updateProductRemain(productNum, productRemain);
		// productNum 의 productRemain 을 salesNum 만큼 빼주기
		// userId 의 userPoint 를 productPrice의 10퍼센트 증가

		return "UserMain";
	}
}
