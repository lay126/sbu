package sbu.spring.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AccountsUser implements Serializable {

	private String usernum;
	private String username;
	private String userid;
	private String userpwd;
	private String useremail;
	private String userphone;
	private String userpoint;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsernum() {
		return usernum;
	}

	public void setUsernum(String usernum) {
		this.usernum = usernum;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUserpoint() {
		return userpoint;
	}

	public void setUserpoint(String userpoint) {
		this.userpoint = userpoint;
	}

}