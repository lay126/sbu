package sbu.spring.domain;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Purchase implements Serializable{
	//for user
	private String buyUserId;
	private int buyProductNum;
	private String buyDate;
	private int buyNum;
	
	public String getBuyUserId() {
		return buyUserId;
	}
	public void setBuyUserId(String buyUserId) {
		this.buyUserId = buyUserId;
	}
	public int getProductNum() {
		return buyProductNum;
	}
	public void setProductNum(int buyProductNum) {
		this.buyProductNum = buyProductNum;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public int getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
	
	
}
