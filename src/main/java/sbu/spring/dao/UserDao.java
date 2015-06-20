package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

public interface UserDao {

	User getUser(String userId) throws DataAccessException;
	
	User getUser(String userId, String userPwd) throws DataAccessException;

	List<Purchase> getUserList(String userId)  throws DataAccessException;
	
	String getUserNameByUserId(String userId);
}
