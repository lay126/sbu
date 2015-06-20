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

	@Override
	public User getUser(String userId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userId, String userPwd)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUserList(String userId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserNameByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
