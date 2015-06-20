package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sbu.spring.domain.Product;
import sbu.spring.service.sBuFacade;

@Controller
public class ViewProductController {

	Product product = new Product();
	private sBuFacade sBuf;

	@Autowired
	public void setPetStore(sBuFacade sBu) {
		this.sBuf = sBu;
	}

	//@RequestMapping(value = "/jsp/viewProduct.do", method = RequestMethod.POST)
	@RequestMapping("/jsp/viewProduct.do")
	public String handleRequest(
			@RequestParam(value = "productNum", defaultValue = "1") int productNum,
			ModelMap model) throws Exception {
		Product product = this.sBuf.getProduct(productNum);
		model.put("product", product);
		model.put("product", product.getProductName());
		if (product == null) {
			System.out.println("product null");
		} else {
			System.out.println("product name : " + product.getProductName());
		}

		return "Product";
	}

}
