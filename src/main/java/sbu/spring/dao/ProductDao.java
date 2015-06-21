package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.Product;

public interface ProductDao {
	List<Product> getProductListByCategory(int productCateNum)
			throws DataAccessException;

	Product getProduct(int productNum) throws DataAccessException;

	void updateProductRemain(int productNum, int productRemain) throws DataAccessException;

	List<Product> getProductListByEventNum(int productEventNum)
			throws DataAccessException;
}