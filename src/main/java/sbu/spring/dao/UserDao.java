package sbu.spring.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import sbu.spring.domain.User;

public interface UserDao {

	User getUser(String userId) throws DataAccessException;
	
	User getUser(String userId, String userPwd) throws DataAccessException;
	
	void insertUser(User user) throws DataAccessException;
	
	void updateUser(User user) throws DataAccessException;

	List<String> getUserList()  throws DataAccessException;
	
	String getUserNameByUserId(int userId);
}
