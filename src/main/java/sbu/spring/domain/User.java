/*ke*/
package sbu.spring.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{
	
	private String userId; //idx
	private String userName;
	private String userPwd;
	private String userEmail;
	private String userPhone;
	private String userBirth;
	private String Point;
	private int userNumber; //sequence
	
	
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getPoint() {
		return Point;
	}
	public void setPoint(String point) {
		Point = point;
	}
}
