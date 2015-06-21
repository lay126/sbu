package sbu.spring.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Category implements Serializable {
	private int cateNum;
	private String cateName;
	
	public int getCateNum() {
		return cateNum;
	}
	public void setCateNum(int cateNum) {
		this.cateNum = cateNum;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	
}
