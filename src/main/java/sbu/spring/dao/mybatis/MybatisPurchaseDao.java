package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sbu.spring.dao.PurchaseDao;
import sbu.spring.dao.mybatis.mapper.PurchaseMapper;
import sbu.spring.dao.mybatis.mapper.UserMapper;
import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;

@Repository
public class MybatisPurchaseDao implements PurchaseDao {

	@Autowired
	PurchaseMapper purchaseMapper;

	@Override
	public List<Purchase> getPurchaseListByUserId(String userId)
			throws DataAccessException {
		return purchaseMapper.getPurchaseList(userId);
	}

	@Transactional
	@Override
	public void insertPurchase(int buyProductNum, String buyUserId)
			throws DataAccessException {
		purchaseMapper.insertPurchase(buyProductNum, buyUserId);
	}

	@Transactional
	@Override
	public void updateUserPoint(int userPoint, String userId)
			throws DataAccessException {
		purchaseMapper.updateUserPoint(userPoint, userId);
	}

}
