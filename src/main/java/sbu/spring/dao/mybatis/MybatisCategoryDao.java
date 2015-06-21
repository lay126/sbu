package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import sbu.spring.dao.CategoryDao;
import sbu.spring.domain.Category;
import sbu.spring.dao.mybatis.mapper.CategoryMapper;

@Repository
public class MybatisCategoryDao implements CategoryDao {
	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public Category getCategory(int cateNum) throws DataAccessException {
		// TODO Auto-generated method stub
		return categoryMapper.getCategory(cateNum);
	}
}