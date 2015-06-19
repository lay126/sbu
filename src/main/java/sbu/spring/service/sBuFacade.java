package sbu.spring.service;

import java.util.List;

import sbu.spring.domain.User;
import sbu.spring.domain.Product;

public interface sBuFacade {

	User getUser(String userId);

	User getUser(String userId, String userPwd);

	void insertUser(User user);

	void updateUser(User user);

	List<String> getUserList();

	//String getUserNameByUserId(int userId);
	
	List<String> getUsernameList();

	List<Product> getProductListByCategory(int productCateNum);

	// List<Product> searchProductList(String keywords);

	Product getProduct(int productNum);

	// void insertOrder(Order order);
	//
	// Order getOrder(int orderId);
	//
	// List<Order> getOrdersByUsername(String username);

}
