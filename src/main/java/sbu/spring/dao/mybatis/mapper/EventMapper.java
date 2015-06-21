package sbu.spring.dao.mybatis.mapper;

import sbu.spring.domain.*;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface EventMapper {
	
	List<Event> getEventList();

	void insertEvent(String eventName, String eventStartName, String eventEndName, String eventText) throws DataAccessException;


	void deleteEvent(int eventNum);

}
