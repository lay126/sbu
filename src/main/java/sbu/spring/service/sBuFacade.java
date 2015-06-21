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
	
	User getUserByBirth(String userBirth);

	List<Product> getProductListByProductCateNum(int productCateNum);
	
	List<Purchase> getPurchaseListByUserId(String userId);

	Product getProduct(int productNum);
	
	List<Product> getProductListByEventNum(int productEventNum);

	List<Event> getEventList();
	
	void insertEvent(Event event);
	
	void deleteEvent(int eventNum);

	Category getCategory(int cateNum);

	void updateProductRemain(int productNum, int productRemain);
	
	void insertPurchase(int buyProductNum, String buyUserId);
}