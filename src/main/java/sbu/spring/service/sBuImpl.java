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
	public String getUserNameByUserId(String userId) {
		return userDao.getUserNameByUserId(userId);
	}

	@Override
	public List<Event> getEventList() {
		return eventDao.getEventList();
	}

	@Override
	public void insertEvent(Event event) {
		eventDao.insertEvent(event);
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
	public List<Purchase> getpurchaseList(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductListByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Purchase> getPurchaseList(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProductRemain(int productNum) {
		// TODO Auto-generated method stub
		
	}

}
