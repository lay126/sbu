package sbu.spring.service;

import java.util.List;


import sbu.spring.domain.User;
import sbu.spring.domain.Account;
import sbu.spring.domain.Product;

/**
 * JPetStore's central business interface.
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public interface sBuFacade {

	Account getAccount(String username);

	Account getAccount(String username, String password);

	void insertAccount(Account account);

	void updateAccount(Account account);

	List<String> getUsernameList();

	List<Product> getProductListByCategory(String categoryId);

	List<Product> searchProductList(String keywords);

	Product getProduct(int productNum);


	List<Product> getItemListByProduct(String productId);

	Product getItem(String itemId);

	boolean isItemInStock(String itemId);


//	void insertOrder(Order order);
//
//	Order getOrder(int orderId);
//
//	List<Order> getOrdersByUsername(String username);

}
