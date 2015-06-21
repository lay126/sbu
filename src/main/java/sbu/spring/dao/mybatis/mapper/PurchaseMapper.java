package sbu.spring.dao.mybatis.mapper;
import sbu.spring.domain.Purchase;

import java.util.List;

public interface PurchaseMapper {
	List<Purchase> getPurchaseList(String userId);
	
	void insertPurchase(int buyProductNum, String buyUserId);
}
