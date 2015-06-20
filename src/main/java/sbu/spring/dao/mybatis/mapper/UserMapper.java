package sbu.spring.dao.mybatis.mapper;

import java.util.List;

import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

public interface UserMapper {

	User getUserByUserIdAndUserPwd(String userId, String userPwd);

	User getUserByUserId(String userId);

	String getUserNameByUserId(String userId);
	
	List<Purchase> getPurchaseList(String userId);
	
}
