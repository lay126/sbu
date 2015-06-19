package sbu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	private Authenticator authenticator;

	@ModelAttribute("login")
	public LoginCommand formBacking() {
		return new LoginCommand();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "loginForm";
	}

	@RequestMapping(value="/user/login.do", method = RequestMethod.POST)
	public String submit(@ModelAttribute("loginUser") LoginCommand loginCommand,
			BindingResult result) {
		
		System.out.println("" + loginCommand.getId());
		
		new LoginCommandValidator().validate(loginCommand, result);
		if (result.hasErrors()) {
			return "loginForm";
		}
		try {
			authenticator.authenticate(loginCommand.getId(), loginCommand
					.getPassword());
			return "loginSuccess";
		} catch (AuthenticationException ex) {
			result.reject("invalidIdOrPassword", new Object[] { loginCommand
					.getId() }, null);
			return "loginForm";
		}
	}
	
	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

}
