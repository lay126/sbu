package sbu.spring.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

public interface UserMapper {

	 User getUserByUserIdAndUserPwd(@Param("userId")String userId, @Param("userPwd")String userPwd);

	User getUserByUserId(String userId);

	String getUserNameByUserId(String userId);
	
}
