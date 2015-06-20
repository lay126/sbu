package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import sbu.spring.dao.PurchaseDao;
import sbu.spring.dao.mybatis.mapper.UserMapper;
import sbu.spring.domain.Purchase;

@Repository
public class MybatisPurchaseDao implements PurchaseDao{

	@Autowired
	UserMapper userMapper;
	@Override
	public List<Purchase> getpurchaseList(String userId)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return userMapper.getPurchaseList(userId);
	}
	
}