package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.domain.Product;
import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
@SessionAttributes("userSession")
public class LoginController {

	User user = new User();
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
		
		return "UserMain";
	}
}
