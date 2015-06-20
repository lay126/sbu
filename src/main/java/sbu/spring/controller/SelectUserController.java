package sbu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelectUserController {
	
	@RequestMapping("/select/user.do")
	public String form() {
		return "UserMain";
	}

	

}
