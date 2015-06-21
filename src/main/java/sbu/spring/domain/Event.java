package sbu.spring.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Event implements Serializable{
	
	private int eventNum;
	private String eventName;
	private int eventStartDate;
	private int eventEndDate;
	private String eventText;
	public int getEventNum() {
		return eventNum;
	}
	public void setEventNum(int eventNum) {
		this.eventNum = eventNum;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getEventStartDate() {
		return eventStartDate;
	}
	public void setEventStartDate(int eventStartDate) {
		this.eventStartDate = eventStartDate;
	}
	public int getEventEndDate() {
		return eventEndDate;
	}
	public void setEventEndDate(int eventEndDate) {
		this.eventEndDate = eventEndDate;
	}
	public String getEventText() {
		return eventText;
	}
	public void setEventText(String eventText) {
		this.eventText = eventText;
	}
	
	
	
}
