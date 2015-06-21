package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import sbu.spring.domain.Category;
import sbu.spring.domain.Event;
import sbu.spring.domain.Product;

public interface CategoryDao {
	Category getCategory(int cateNum) throws DataAccessException;

}