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
			
			//model.put("event", event);
			//eventName = event.getEventName();
			
			//model.put("event", event);
			return "EventList";
		
		
		
	}
//	@RequestMapping("/user/buy.do")
//	public String handleRequest(@RequestParam("productNum") int productNum,
//			@RequestParam("userId") String userId,
//			@RequestParam("salesNum") int salesNum, ModelMap model)
//			throws Exception {
//		product = this.sBuf.getProduct(productNum);
//		user = this.sBuf.getUser(userId);
//
//		// productNum 의 productRemain 을 salesNum 만큼 빼주기
//		int productRemain = product.getProductRemain() - salesNum;
//		this.sBuf.updateProductRemain(productNum, productRemain);
//
//		// buylistDB에 상품명과 고객id 추가
//		this.sBuf.insertPurchase(productNum, userId);
//
//		// userId 의 userPoint 를 productPrice의 10퍼센트 증가
//		int userPoint = user.getUserPoint()
//				+ (int) (product.getProductPrice() * 0.1);
//		this.sBuf.updateUserPoint(userPoint, userId);
//
//		model.put("product", product);
//
//		return "AdminSellForm";
//	}
//	
	
	
	
	//@RequestMapping("/jsp/viewEventList.do")
	public String handleRequest(
			@RequestParam(value = "eventNum") int eventNum, ModelMap model)
			throws Exception {

		eventList = new PagedListHolder<Event>(
				this.sBuf.getEventList());
		eventList.setPageSize(10);

		model.put("eventList", eventList);
		model.put("eventText", eventNum);

		return "EventListView";
	}
}
