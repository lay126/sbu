package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import sbu.spring.dao.EventDao;
import sbu.spring.dao.ProductDao;
import sbu.spring.dao.mybatis.mapper.EventMapper;
import sbu.spring.dao.mybatis.mapper.ProductMapper;
import sbu.spring.domain.Event;
import sbu.spring.domain.Product;

@Repository
public class MybatisEventDao implements EventDao {

	@Autowired
	private EventMapper eventMapper;

	@Override
	public List<Event> getEventList() throws DataAccessException {
		return eventMapper.getEventList();
	}

	@Override
	public void insertEvent(Event event) throws DataAccessException {
		eventMapper.insertEvent(event);
	}

	@Override
	public void deleteEvent(int eventNum) throws DataAccessException {
		eventMapper.deleteEvent(eventNum);
	}

}