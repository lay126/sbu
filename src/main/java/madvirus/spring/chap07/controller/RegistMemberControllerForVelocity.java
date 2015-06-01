package madvirus.spring.chap07.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/regist.do")
public class RegistMemberControllerForVelocity {

	private String formViewName = "registMemberForm";

	@RequestMapping(method = RequestMethod.GET)
	public String form(Model model) {
		referenceData(model);
		return formViewName;
	}

	private void referenceData(Model model) {
		Map<String, String> jobCodes = new LinkedHashMap<String, String>();
		jobCodes.put("1", "개발자");
		jobCodes.put("2", "UI 개발자");
		jobCodes.put("3", "웹 디자이너");
		jobCodes.put("4", "기획자");

		Map<String, String> favoritesOsNames = new LinkedHashMap<String, String>();
		favoritesOsNames.put("윈도우XP", "윈도우XP");
		favoritesOsNames.put("비스타", "비스타");
		favoritesOsNames.put("윈도우7", "윈도우7");
		favoritesOsNames.put("우분투", "우분투");
		favoritesOsNames.put("맥", "맥");
		
		Map<String, String> tools = new LinkedHashMap<String, String>();
		tools.put("Eclipse", "Eclipse");
		tools.put("IntelliJ", "IntelliJ");
		tools.put("NetBeans", "NetBeans");

		model.addAttribute("jobCodes", jobCodes);
		model.addAttribute("favoritesOsNames", favoritesOsNames);
		model.addAttribute("tools", tools);
	}

	@ModelAttribute
	protected Object formBackingObject() throws Exception {
		return new MemberInfo();
		// MemberInfo member = new MemberInfo();
		// member.setAddress(new Address());
		// return member;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute MemberInfo memberInfo,
			BindingResult result, Model model) {
		new MemberInfoValidator().validate(memberInfo, result);
		checkDuplicateId(memberInfo.getUserId(), result);
		if (result.hasErrors()) {
			referenceData(model);
			return formViewName;
		}
		return "registMember";
	}

	private void checkDuplicateId(String userId, BindingResult errors) {
		if (userId.equals("madvirus")) {
			errors.rejectValue("userId", "duplicate");
		}
	}

}
