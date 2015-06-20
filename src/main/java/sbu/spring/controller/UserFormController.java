package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import sbu.spring.service.sBuFacade;

@Controller
@RequestMapping("/user/login_d.do")
public class UserFormController { 

	@Value("EditAccountForm")
	private String formViewName;
	@Value("index")
	private String successViewName;
	private static final String[] LANGUAGES = {"english", "japanese"};
	
	@Autowired
	private sBuFacade sBuf;
	public void setPetStore(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}


	@ModelAttribute("accountForm")
	public UserForm formBackingObject(HttpServletRequest request) 
			throws Exception {
		UserSession userSession = 
			(UserSession) WebUtils.getSessionAttribute(request, "userSession");
		if (userSession != null) {	// edit an existing account
			return new UserForm(
				sBuf.getUser(userSession.getUser().getUserId()));
		}
		else {	// create a new account
			return new UserForm();
		}
	}

	@ModelAttribute("languages")
	public String[] getLanguages() {
		return LANGUAGES;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showForm() {
		return formViewName;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(
			HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm") UserForm userForm,
			BindingResult result) throws Exception {
		
		if (result.hasErrors()) return formViewName;
		
		UserSession userSession = new UserSession(
			sBuf.getUser(userForm.getuser().getUserId()));
		session.setAttribute("userSession", userSession);
		return successViewName;  
	}
}
