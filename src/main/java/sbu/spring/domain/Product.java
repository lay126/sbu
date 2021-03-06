package sbu.spring.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable{

	private int productNum;
	private String productName;
	private int productRemain;
	private int productCateNum;
	private int productPrice;
	private String productDescription;
	private int productEventNum;

	public int getProductEventNum() {
		return productEventNum;
	}

	public void setProductEventNum(int productEventNum) {
		this.productEventNum = productEventNum;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductRemain() {
		return productRemain;
	}

	public void setProductRemain(int productRemain) {
		this.productRemain = productRemain;
	}

	public int getProductCateNum() {
		return productCateNum;
	}

	public void setProductCateNum(int productCateNum) {
		this.productCateNum = productCateNum;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
