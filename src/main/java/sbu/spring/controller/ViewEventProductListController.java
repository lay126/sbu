package sbu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sbu.spring.domain.Event;
import sbu.spring.domain.Product;
import sbu.spring.service.sBuFacade;

@Controller
public class ViewEventProductListController {

	PagedListHolder<Product> eventProductList = null;
	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping("/jsp/viewEventProductList.do")
	public String handleRequest(
			@RequestParam(value = "eventNum") int eventNum, ModelMap model)
			throws Exception {

		eventProductList = new PagedListHolder<Product>(
				this.sBuf.getProductListByEventNum(eventNum));
		eventProductList.setPageSize(10);
		
		model.put("eventProductList", eventProductList);
		model.put("eventText", eventNum);

		return "EventProductList";
	}
}
