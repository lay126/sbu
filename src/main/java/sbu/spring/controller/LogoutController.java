package sbu.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	@RequestMapping("/user/logout.do")
	public String handleRequest(HttpSession session) throws Exception {
		session.removeAttribute("userSession");
		session.removeAttribute("viewStateSession");

		session.invalidate();
		return "index";
	}
}
