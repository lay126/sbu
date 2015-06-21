package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import sbu.spring.dao.PurchaseDao;
import sbu.spring.dao.mybatis.mapper.PurchaseMapper;
import sbu.spring.dao.mybatis.mapper.UserMapper;
import sbu.spring.domain.Product;
import sbu.spring.domain.Purchase;

@Repository
public class MybatisPurchaseDao implements PurchaseDao{

	@Autowired
	PurchaseMapper userMapper;
	  @Override
	   public List<Product> getPurchasetListByCategory(int productCateNum) {
	      return productMapper.getPurchaseListByCategory(productCateNum);
	   }

}
