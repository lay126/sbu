package sbu.spring.service;

import java.util.List;


import sbu.spring.domain.User;
import sbu.spring.domain.Account;
import sbu.spring.domain.Product;

public interface sBuFacade {

	Account getAccount(String username);

	Account getAccount(String username, String password);

	void insertAccount(Account account);

	void updateAccount(Account account);

	List<String> getUsernameList();

	List<Product> getProductListByCategory(int productCateNum);

	// List<Product> searchProductList(String keywords);

	Product getProduct(int productNum);


//	void insertOrder(Order order);
//
//	Order getOrder(int orderId);
//
//	List<Order> getOrdersByUsername(String username);

}
