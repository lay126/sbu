package sbu.spring.dao.mybatis;

import sbu.spring.dao.UserDao;
import sbu.spring.dao.mybatis.mapper.UserMapper;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisUserDao implements UserDao {

	@Autowired
	private UserMapper userMapper;

	// @Override
	public User getUser(String userId) throws DataAccessException {
		return userMapper.getUserByUserId(userId);
	}

	// @Override
	public User getUser(String userId, String userPwd)
			throws DataAccessException {
		return userMapper.getUserByUserIdAndUserPwd(userId, userPwd);
	}

	// @Override
	public String getUserNameByUserId(String userId) {
		return userMapper.getUserNameByUserId(userId);
	}

	@Override
	public User getUserByUserBirth(String userBirth) throws DataAccessException {
		return userMapper.getUserByUserBirth(userBirth);
	}

}
