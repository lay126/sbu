package madvirus.spring.chap07.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
