package sbu.spring.dao.mybatis.mapper;

import sbu.spring.domain.*;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

public interface EventMapper {
	
	List<Event> getEventList();

	void insertEvent(@Param("eventName") String eventName,
			@Param("eventStartDate") String eventStartDate,
			@Param("eventEndDate") String eventEndDate,
			@Param("eventText") String eventText);

	void deleteEvent(int eventNum);

}
