package sbu.spring.controller_tmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/regist.do")
public class RegistMemberController {

	private String formViewName = "registMemberForm";

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return formViewName;
	}

	@ModelAttribute("jobCodes")
	public List<Code> referenceData1() {
		List<Code> jobCodes = new ArrayList<Code>();
		jobCodes.add(new Code("1", "개발자"));
		jobCodes.add(new Code("2", "UI 개발자"));
		jobCodes.add(new Code("3", "웹 디자이너"));
		jobCodes.add(new Code("3", "기획자"));
		return jobCodes;
	}
	@ModelAttribute("favoritesOsNames")
	public String[] referenceData2() {
		return new String[] { "윈도우XP", "비스타", "윈도우7", "우분투", "맥" };
	}
	
	@ModelAttribute("tools")
	public String[] referenceData3() {
		return new String[] { "Eclipse", "IntelliJ", "NetBeans" };
	}

	@ModelAttribute
	protected Object formBackingObject() throws Exception {
		return new MemberInfo();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute MemberInfo memberInfo,
			BindingResult result, Model model) {
		new MemberInfoValidator().validate(memberInfo, result);
		checkDuplicateId(memberInfo.getUserId(), result);
		if (result.hasErrors()) {
			return formViewName;
		}
		System.out.println(memberInfo.getJobCode());
		for (String s : memberInfo.getFavorites()) {
			System.out.print(s + " ");
		} 
		System.out.println();
		System.out.println(memberInfo.getTool());
		return "registMember";
	}

	private void checkDuplicateId(String userId, BindingResult errors) {
		if (userId.equals("madvirus")) {
			errors.rejectValue("userId", "duplicate");
		}
	}

}
