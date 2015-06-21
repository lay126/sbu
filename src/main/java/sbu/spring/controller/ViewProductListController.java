package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sbu.spring.domain.Product;
import sbu.spring.service.sBuFacade;

@Controller
public class ViewProductListController {

	PagedListHolder<Product> productList = null;
	// Category category = null;
	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}

	@RequestMapping("/jsp/viewProductList.do")
	public String handleRequest(
			@RequestParam(value = "productCateNum") int productCateNum,
			ModelMap model) throws Exception {
		productList = new PagedListHolder<Product>(
				this.sBuf.getProductListByCategory(productCateNum));
		productList.setPageSize(10);
		model.put("productList", productList);
		model.put("cateNum", productCateNum);
		
		return "ProductList";
	}
}
