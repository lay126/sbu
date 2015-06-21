package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String handleRequest(HttpServletRequest request,
			ModelMap model)
			throws Exception {

	//	User user = this.sBuf.getUser(userId, userPwd);
		
		return "UserMain";
	}
}
