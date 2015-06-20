package sbu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sbu.spring.dao.*;
import sbu.spring.domain.Product;
import sbu.spring.domain.User;

@Service
@Transactional
public class sBuImpl implements sBuFacade {

	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	@Transactional
	public User getUser(String userId) {
		return userDao.getUser(userId);
	}
	
	@Autowired
	public User getUser(String userId, String userPwd) {
		return userDao.getUser(userId, userPwd);
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public List<String> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUsernameList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductListByCategory(int productCateNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(int productNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
