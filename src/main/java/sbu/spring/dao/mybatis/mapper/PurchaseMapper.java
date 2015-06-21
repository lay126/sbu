package sbu.spring.dao.mybatis.mapper;

import sbu.spring.domain.Purchase;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

public interface PurchaseMapper {
	List<Purchase> getPurchaseList(String userId);

	void insertPurchase(@Param("buyProductNum") int buyProductNum,
			@Param("buyUserId") String buyUserId);

	void updateUserPoint(@Param("userPoint") int userPoint,
			@Param("userId") String userId);

}
