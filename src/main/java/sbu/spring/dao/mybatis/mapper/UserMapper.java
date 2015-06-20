package sbu.spring.dao.mybatis.mapper;

import java.util.List;
import sbu.spring.domain.Purchase;
import sbu.spring.domain.User;

public interface UserMapper {

	User getUserByUserId(String userId, String userPwd);

	User getUserByUserIdAndUserPwd(User user);

	String getUserNameByUserId(int userId);
	
	List<Purchase> getPurchaseList(String userId);
	
}
