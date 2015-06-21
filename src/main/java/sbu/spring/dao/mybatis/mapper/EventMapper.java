package sbu.spring.dao.mybatis.mapper;

import sbu.spring.domain.*;
import java.util.List;

public interface EventMapper {
	
	List<Event> getEventList();

	void insertEvent(Event event);

	void deleteEvent(int eventNum);

}
