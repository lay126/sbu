package sbu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/join/user.do")
public class UserJoinController {

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "UserJoinForm";
	}

	

}
