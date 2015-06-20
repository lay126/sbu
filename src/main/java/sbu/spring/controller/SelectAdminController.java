package sbu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/select/admin.do")
public class SelectAdminController {

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "AdminMain";
	}

	

}
