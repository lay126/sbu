package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sbu.spring.dao.ProductDao;
import sbu.spring.dao.mybatis.mapper.ProductMapper;
import sbu.spring.domain.Product;

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


}
