package sbu.spring.controller;

import java.io.Serializable;

import org.springframework.beans.support.PagedListHolder;

import sbu.spring.domain.User;

@SuppressWarnings("serial")
public class UserSession implements Serializable {

	private User user;

	//private PagedListHolder<Product> myList;

	public UserSession(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

//
//	public void setMyList(PagedListHolder<Product> myList) {
//		this.myList = myList;
//	}
//
//	public PagedListHolder<Product> getMyList() {
//		return myList;
//	}
}
