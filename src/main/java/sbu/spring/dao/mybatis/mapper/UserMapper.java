package sbu.spring.dao.mybatis.mapper;

import java.util.List;

import sbu.spring.domain.User;

public interface UserMapper {

	User getUserByUserId(String userId);

	User getUserByUserIdAndUserPwd(User user);

	void insertUser(User user);

	void updateUser(User user);

	List<String> getUserList();

	String getUserNameByUserId(int userId);

	User getUserByUserId(String userId, String userPwd);

}
