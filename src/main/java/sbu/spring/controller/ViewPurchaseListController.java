package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;
import sbu.spring.service.sBuFacade;

@Controller
@SessionAttributes("userSession")
public class ViewPurchaseListController {

	PagedListHolder<Purchase> purchaseList = null;
	User user = new User();
	private sBuFacade sBuf;

	@Autowired
	public void setSBuf(sBuFacade sBuf) {
		this.sBuf = sBuf;
	}
	UserSession userSession = new UserSession(user);
	//model.addAttribute("userSession", userSession);
	
	@RequestMapping("/jsp/viewPurchaseList.do")
	public String handleRequest(
			@RequestParam(value = "userSession.userId") int userId,
			ModelMap model) throws Exception {
		purchaseList = new PagedListHolder<Purchase>(
				this.sBuf.getPurchaseListByCategory(productCateNum));
		productList.setPageSize(10);
		model.put("productList", productList);
		model.put("cateNum", productCateNum);
		
		return "ProductList";
	}
}
