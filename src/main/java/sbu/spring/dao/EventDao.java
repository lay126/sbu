package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.Category;
import sbu.spring.domain.Event;

public interface EventDao{
	

	List<Event> getEventList() throws DataAccessException;

	void insertEvent(Event event) throws DataAccessException;

	void deleteEvent(int eventNum) throws DataAccessException;
	
	
}