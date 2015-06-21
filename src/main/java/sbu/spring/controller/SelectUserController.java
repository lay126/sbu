package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import sbu.spring.domain.Event;
import sbu.spring.domain.Product;
import sbu.spring.service.sBuFacade;

@Controller
public class SelectUserController {

	PagedListHolder<Event> eventList = null;
	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping("/select/user.do")
	public String handleRequest(ModelMap model) throws Exception {

		eventList = new PagedListHolder<Event>(this.sBuf.getEventList());
		model.put("eventList", eventList);
			
		return "UserMain";
	}

}
