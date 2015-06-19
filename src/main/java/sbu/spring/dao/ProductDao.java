package sbu.spring.dao;

import java.util.List;
import sbu.spring.domain.Product;

public interface ProductDao {
	List<Product> getProductListByCategory(int productCateNum);
	// throws DataAccessException;

	Product getProduct(int productNum);
	// throws DataAccessException;

	// List<Product> searchProductList(String keywords);
	// throws DataAccessException;
}
