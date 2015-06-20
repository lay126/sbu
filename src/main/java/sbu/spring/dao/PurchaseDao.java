package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.Purchase;

public interface PurchaseDao {
	List<Purchase> getpurchaseList(String userId) throws DataAccessException;
}