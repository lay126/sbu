package sbu.spring.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import sbu.spring.domain.Event;
import sbu.spring.domain.Product;

public interface EventDao {

	List<Event> getEventList() throws DataAccessException;

	void insertEvent(Event event) throws DataAccessException;

	void deleteEvent(int eventNum) throws DataAccessException;

}