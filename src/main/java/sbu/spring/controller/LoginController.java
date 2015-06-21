package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.domain.Event;
import sbu.spring.domain.Product;
import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
@SessionAttributes("userSession")
public class LoginController {

	User user = new User();
	PagedListHolder<Event> eventList = null;
	PagedListHolder<Product> productAll = null;
	Product recoLastProduct = null;
	private sBuFacade sBuf;
	
	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping("/user/login.do")
	public String handleRequest(HttpServletRequest request,
			@RequestParam("userId") String userId,
			@RequestParam("userPwd") String userPwd, ModelMap model)
			throws Exception {

		User user = this.sBuf.getUser(userId, userPwd);
		model.put("user", user);

		if (user != null) {
			UserSession userSession = new UserSession(user);
			model.addAttribute("userSession", userSession);
		}
		
		eventList = new PagedListHolder<Event>(this.sBuf.getEventList());
		model.put("eventList", eventList);
		
		productAll = new PagedListHolder<Product>(this.sBuf.getProductAll());
		model.put("productAll", productAll);
		model.put("productLastNum", productAll.getNrOfElements());
		
		// get new product (recoLastProduct)
		for (int i = 0; i < productAll.getNrOfElements(); i++ ){
			if (i == productAll.getNrOfElements()-1) {
				model.put("recoLastProduct", productAll.getSource().get(i));
			}
		}
		
		
		
		model.put("recoAgeProduct", productAll.getPageList().get(productAll.getLastElementOnPage()));
		model.put("recoBuyProduct", productAll.getPageList().get(productAll.getLastElementOnPage()));
		
		if (user.getUserId().equals("admin")) {
			return "AdminMain";
		} else {
			return "UserMain";
		}
		
	}
}
