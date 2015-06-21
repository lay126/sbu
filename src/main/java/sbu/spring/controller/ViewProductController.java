package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sbu.spring.domain.Product;
import sbu.spring.service.sBuFacade;

@Controller
public class ViewProductController {

	Product product;
	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBu) {
		this.sBuf = sBu;
	}

	@RequestMapping("/jsp/viewProduct.do")
	public String handleRequest(
			@RequestParam(value = "productNum") int productNum,
			ModelMap model) throws Exception {
		Product product = this.sBuf.getProduct(productNum);
		model.put("product", product);

		return "Product";
	}
	
	@RequestMapping("/jsp/viewProductRemain.do")
	public String handleRequest2(
			@RequestParam("productNum") int productNum,
			ModelMap model) throws Exception {
		Product product = this.sBuf.getProduct(productNum);
		model.put("product", product);

		return "AdminSellForm";
	}

}
