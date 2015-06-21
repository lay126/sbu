package sbu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbu.spring.dao.*;
import sbu.spring.domain.Category;
import sbu.spring.domain.Event;
import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

@Service
public class sBuImpl implements sBuFacade {

	@Autowired
	private UserDao userDao;

	@Autowired
	private ProductDao productDao;

	@Autowired
	private EventDao eventDao;

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	public User getUser(String userId) {
		return userDao.getUser(userId);
	}

	@Override
	public User getUser(String userId, String userPwd) {
		return userDao.getUser(userId, userPwd);
	}

	@Override
	public Product getProduct(int productNum) {
		return productDao.getProduct(productNum);
	}

	@Override
	public List<Product> getProductAll() {
		return productDao.getProductAll();
	}

	@Override
	public String getUserNameByUserId(String userId) {
		return userDao.getUserNameByUserId(userId);
	}

	@Override
	public List<Event> getEventList() {
		return eventDao.getEventList();
	}

	@Override
	public void deleteEvent(int eventNum) {
		eventDao.deleteEvent(eventNum);
	}

	@Override
	public Category getCategory(int cateNum) {
		return categoryDao.getCategory(cateNum);
	}

	@Override
	public void updateProductRemain(int productNum, int productRemain) {
		productDao.updateProductRemain(productNum, productRemain);
	}

	@Override
	public List<Product> getProductListByProductCateNum(int productCateNum) {
		return productDao.getProductListByCategory(productCateNum);
	}

	@Override
	public List<Purchase> getPurchaseListByUserId(String userId) {
		return purchaseDao.getPurchaseListByUserId(userId);
	}

	@Override
	public List<Product> getProductListByEventNum(int productEventNum) {
		return productDao.getProductListByEventNum(productEventNum);
	}

	@Override
	public User getUserByBirth(String userBirth) {
		return userDao.getUserByUserBirth(userBirth);
	}

	@Override
	public void insertPurchase(int buyProductNum, String buyUserId) {
		purchaseDao.insertPurchase(buyProductNum, buyUserId);
	}

	@Override
	public Product getLastProduct() {
		return productDao.getLastProduct();
	}

	@Override
	public void updateUserPoint(int userPoint, String userId) {
		purchaseDao.updateUserPoint(userPoint, userId);

	}


	@Override
	public List<User> getUserAll() {
		return userDao.getUserAll();
	}

@Override
public void insertEvent(String eventName, int eventStartDate, String eventText,
		int eventEndDate) {
	eventDao.insertEvent(eventName, eventStartDate, eventEndDate, eventText);
}



}