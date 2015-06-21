package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.domain.Event;
import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
public class EventController {

	PagedListHolder<Event> eventList = null;
	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}
	
	@RequestMapping("/jsp/writeEvent.do")
	public String writeEvent(
			@RequestParam("eventName")String eventName,
			@RequestParam("eventStartDate")int eventStartDate,
			@RequestParam("eventEndDate")int eventEndDate, 
			@RequestParam("eventText")String eventText,
			ModelMap model)throws Exception{
			
			this.sBuf.insertEvent(eventName, eventStartDate, eventEndDate,eventText);
			
			eventList = new PagedListHolder<Event>(
					this.sBuf.getEventList());
			eventList.setPageSize(10);

			model.put("eventList", eventList);
			return "EventList";
		
		
		
	}
	
	
	@RequestMapping("/jsp/viewEventList.do")
	public String handleRequest(
			@RequestParam(value = "eventNum") int eventNum, ModelMap model)
			throws Exception {

		eventList = new PagedListHolder<Event>(
				this.sBuf.getEventList());
		eventList.setPageSize(10);

		model.put("eventList", eventList);
		model.put("eventText", eventNum);

		return "EventList";
	}
}
