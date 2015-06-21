package sbu.spring.dao.mybatis.mapper;

import sbu.spring.domain.Category;

public interface CategoryMapper {

	Category getCategory(int cateNum);
}