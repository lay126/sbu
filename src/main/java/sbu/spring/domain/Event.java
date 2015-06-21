package sbu.spring.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Event implements Serializable{
	
	private int eventNum;
	private String eventName;
	private int eventKind;
	private int eventProductNum;
	private String eventStartDate;
	private String eventEndDate;
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
	public int getEventKind() {
		return eventKind;
	}
	public void setEventKind(int eventKind) {
		this.eventKind = eventKind;
	}
	public int getEventProductNum() {
		return eventProductNum;
	}
	public void setEventProductNum(int eventProductNum) {
		this.eventProductNum = eventProductNum;
	}
	public String getEventStartDate() {
		return eventStartDate;
	}
	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}
	public String getEventEndDate() {
		return eventEndDate;
	}
	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}
	public String getEventText() {
		return eventText;
	}
	public void setEventText(String eventText) {
		this.eventText = eventText;
	}
	
	
	
}
