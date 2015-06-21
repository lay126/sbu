package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.Category;
import sbu.spring.domain.Event;

public interface EventDao{
	
	void insertEvent(String eventName, String eventStartName, String eventEndName, String eventText);
	
	List<Event> getEventList() throws DataAccessException;

	void deleteEvent(int eventNum) throws DataAccessException;
	
	
	
	
}