package sbu.spring.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.Category;
import sbu.spring.domain.Event;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;
import sbu.spring.domain.Product;

public interface sBuFacade {

	User getUser(String userId);

	User getUser(String userId, String userPwd);
	
	String getUserNameByUserId(String userId);
	
	List<Purchase> getPurchaseList(String userId);

	List<Product> getProductListByUserId(String userId);

	Product getProduct(int productNum);

	List<Event> getEventList();
	
	void insertEvent(Event event);
	
	void deleteEvent(int eventNum);
	
	Category getCategory(int cateNum);
	
	List<Purchase> getpurchaseList(String userId);

	void updateProductRemain(int productNum);
}