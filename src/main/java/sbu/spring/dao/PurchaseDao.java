package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;

public interface PurchaseDao {
	 List<Purchase> getPurchaseListByUserId(String userId) throws DataAccessException;
	 
	 void insertPurchase(int buyProductNum, String buyUserId) throws DataAccessException;
}