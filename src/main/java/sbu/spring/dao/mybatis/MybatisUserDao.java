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

}
