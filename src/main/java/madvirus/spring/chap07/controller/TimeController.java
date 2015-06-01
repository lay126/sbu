package madvirus.spring.chap07.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {

	@RequestMapping("/time.do")
	public String time(Model model) {
		model.addAttribute("time", new Date());
		return "time";
	}
}
