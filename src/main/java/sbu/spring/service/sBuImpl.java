package sbu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sbu.spring.dao.*;
import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

@Service
@Transactional
public class sBuImpl implements sBuFacade {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userId, String userPwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Purchase> getPurchaseList(String userId) {
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

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
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
}
