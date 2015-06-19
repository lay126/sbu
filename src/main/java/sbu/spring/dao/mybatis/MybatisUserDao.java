package sbu.spring.dao.mybatis;

import sbu.spring.dao.UserDao;
import sbu.spring.dao.mybatis.mapper.UserMapper;
import sbu.spring.domain.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisUserDao implements UserDao{

	@Autowired
	private UserMapper userMapper;

	public void insertUser(User user) throws DataAccessException {
		userMapper.insertUser(user);
	}

	public void updateUser(User user) throws DataAccessException {
		userMapper.updateUser(user);
	}

	public List<String> getUserList() throws DataAccessException {
		return userMapper.getUserList();
	}

	public User getUser(String userId) throws DataAccessException {
		return userMapper.getUserByUserId(userId);
	}

	public User getUser(String userId, String userPwd) throws DataAccessException{
		return userMapper.getUserByUserId(userId, userPwd);
	}

	public String getUserNameByUserId(int userId) {
		// TODO Auto-generated method stub
		return userMapper.getUserNameByUserId(userId);
	}

}
