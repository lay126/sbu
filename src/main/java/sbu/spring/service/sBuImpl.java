package sbu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbu.spring.dao.*;
import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

@Service
public class sBuImpl implements sBuFacade {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ProductDao productDao;

	@Override
	public User getUser(String userId) {
		return userDao.getUser(userId);
	}

	@Override
	public User getUser(String userId, String userPwd) {
		System.out.println("sBuImpl");
		return userDao.getUser(userId, userPwd);
	}

	@Override
	public List<Purchase> getPurchaseList(String userId) {
		return userDao.getUserList(userId);
	}

	@Override
	public List<Product> getProductListByCategory(int productCateNum) {
		return productDao.getProductListByCategory(productCateNum);
	}

	@Override
	public Product getProduct(int productNum) {
		return productDao.getProduct(productNum);
	}

	@Override
	public String getUserNameByUserId(String userId) {
		return userDao.getUserNameByUserId(userId);
	}

	
}
