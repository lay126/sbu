package sbu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user/login.do")
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

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("login") LoginCommand loginCommand,
			BindingResult result) {
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

//	@ModelAttribute("loginTypes")
//	protected List<String> referenceData() throws Exception {
//		List<String> loginTypes = new ArrayList<String>();
//		loginTypes.add("일반회원");
//		loginTypes.add("기업회원");
//		loginTypes.add("헤드헌터회원");
//		return loginTypes;
//	}

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

}
