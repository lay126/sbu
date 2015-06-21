package sbu.spring.service;

import java.util.List;

import sbu.spring.domain.Event;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;
import sbu.spring.domain.Product;

public interface sBuFacade {

	User getUser(String userId);

	User getUser(String userId, String userPwd);
	
	String getUserNameByUserId(String userId);
	
	List<Purchase> getPurchaseList(String userId);

	List<Product> getProductListByCategory(int productCateNum);

	Product getProduct(int productNum);

	List<Event> getEventList();
	
	void insertEvent(Event event);
	
	void deleteEvent(int eventNum);

}