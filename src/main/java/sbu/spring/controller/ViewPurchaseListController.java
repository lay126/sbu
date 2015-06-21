package sbu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	//model.addAttribute("userSession", userSession);

	@RequestMapping("/jsp/viewPurchaseList.do")
	public String handleRequest(@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		System.out.println(userSession.getUser().getUserId());
		purchaseList = new PagedListHolder<Purchase>(
				this.sBuf.getPurchaseListByUserId(userSession.getUser().getUserId()));
		
		purchaseList.setPageSize(10);
		System.out.println("kkkkk"+purchaseList.getPageCount());
		model.put("purchaseList", purchaseList);
		model.put("userId",userSession.getUser().getUserId());
		
		return "PurchaseList";
	}
}
