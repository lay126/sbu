package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.domain.Product;
import sbu.spring.service.sBuFacade;

@Controller
public class ViewProductListController {
	Product product = new Product();
	private sBuFacade sBuf;
	
	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}
	
	@RequestMapping("/jsp/viewProductList.do")
	public String handleRequest (
			@RequestParam(value = "productCateNum") int productCateNum, 
			ModelMap model) throws Exception {
		
		
		return "ProductList";
		
	}
}


