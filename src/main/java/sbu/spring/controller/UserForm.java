package sbu.spring.controller;

import java.io.Serializable;

import sbu.spring.domain.User;

@SuppressWarnings("serial")
public class UserForm implements Serializable {

	private User user;

	private boolean newuser;

	private String repeatedPassword;

	public UserForm(User user) {
		this.user = user;
		this.newuser = false;
	}

	public UserForm() {
		this.user = new User();
		this.newuser = true;
	}

	public User getuser() {
		return user;
	}

	public boolean isNewuser() {
		return newuser;
	}

	public void setRepeatedPassword(String repeatedPassword) {
		this.repeatedPassword = repeatedPassword;
	}

	public String getRepeatedPassword() {
		return repeatedPassword;
	}
}
