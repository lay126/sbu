package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.service.sBuFacade;
import sbu.spring.domain.User;

@Controller
@SessionAttributes("userSession")
public class LoginController {

	private Authenticator authenticator;

	@Autowired
	private sBuFacade sBuFacade;

	public void setSbuFacade(sBuFacade sBuFacade) {
		this.sBuFacade = sBuFacade;
	}

	// @ModelAttribute("loginUser")
	// public LoginCommand formBacking() {
	// return new LoginCommand();
	// }

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "loginForm";
	}

	//
	@RequestMapping(value = "/user/login.do", method = RequestMethod.POST)
	public ModelAndView handleRequest(
			HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("userPwd") String userPwd,
			@RequestParam(value = "frowardAction", required = false) String forwardAction,
			Model model) throws Exception {
		System.out.println("위치: loginController" + userId);
		User user = this.sBuFacade.getUser(userId, userPwd);
		if (user == null) {
			return new ModelAndView("Error", "message", "no login");
		} else {
			UserSession userSession = new UserSession(user);
			System.out.println("위치 확인" +userSession.getUser());
		}

		if (forwardAction != null) {
			return new ModelAndView("redirect:" + forwardAction);
		} else {
			return new ModelAndView("UserMain");
		}
	}

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}
}

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