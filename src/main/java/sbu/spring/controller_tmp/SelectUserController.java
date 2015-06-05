package sbu.spring.controller_tmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/select/user.do")
public class SelectUserController {




	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "UserMain";
	}

	

}
