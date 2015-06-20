package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
@SessionAttributes("userSession")
public class LoginController {

	private Authenticator authenticator;

	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping(value="/user/login.do", method = RequestMethod.POST)
	public ModelAndView handleRequest(
			HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("userPwd") String userPwd,
			@RequestParam(value = "forwardAction", required = false) String forwardAction,
			Model model) throws Exception {
	
		User user = sBuf.getUser(userId, userPwd);
		if (user == null) {
			return new ModelAndView("Error", "message", "no login");
		} else {
			UserSession userSession = new UserSession(user);
		}

		if (forwardAction != null) {
			return new ModelAndView("redirect:" + forwardAction);
		} else {
			return new ModelAndView("UserMain");
		}
	}

	@RequestMapping(value = "/user/login.do", method = RequestMethod.GET)
	public String form() {
		return "loginForm";
	}
	
	 public void setAuthenticator(Authenticator authenticator) {
	 this.authenticator = authenticator;
	 }
}

// public void setAuthenticator(Authenticator authenticator) {
// this.authenticator = authenticator;
// }
//
//
//
//
// new LoginCommandValidator().validate(loginCommand, result);
// if (result.hasErrors()) {
// return "UserMain";
// }
// try {
// authenticator.authenticate(loginCommand.getId(), loginCommand
// .getPassword());
// return "UserMainLogined";
// } catch (AuthenticationException ex) {
// result.reject("invalidIdOrPassword", new Object[] { loginCommand
// .getId() }, null);
//
// // System.out.println("1: " + loginCommand.getId());
// return "UserMain";
// }
// }
//
// @RequestMapping(value="/user/login.do", method = RequestMethod.POST)
// public String submit(@ModelAttribute("loginUser") LoginCommand
// loginCommand,
// BindingResult result) {
//
// System.out.println("1: " + loginCommand.getId());
//
// new LoginCommandValidator().validate(loginCommand, result);
// if (result.hasErrors()) {
// return "UserMain";
// }
// try {
// authenticator.authenticate(loginCommand.getId(), loginCommand
// .getPassword());
// return "UserMainLogined";
// } catch (AuthenticationException ex) {
// result.reject("invalidIdOrPassword", new Object[] { loginCommand
// .getId() }, null);
// return "UserMain";
// }
// }