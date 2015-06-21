package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import sbu.spring.dao.ProductDao;
import sbu.spring.dao.mybatis.mapper.ProductMapper;
import sbu.spring.domain.Product;

@Repository
public class MybatisProductDao implements ProductDao {
	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<Product> getProductListByCategory(int productCateNum) {
		return productMapper.getProductListByCategory(productCateNum);
	}

	@Override
	public Product getProduct(int productNum) {
		return productMapper.getProduct(productNum);
	}

	@Override
	public List<Product> getProductListByEventNum(int productEventNum) {
		return productMapper.getProductListByEventNum(productEventNum);
	}

	@Override
	public void updateProductRemain(int productNum, int productRemain) {
		productMapper.updateProductRemain(productNum, productRemain);
	}

	@Override
	public Product getLastProduct() throws DataAccessException {
		return productMapper.getLastProduct();
	}

}