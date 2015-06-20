package sbu.spring.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sbu.spring.domain.Purchase;

@SuppressWarnings("serial")
public class UserPurchaseForm implements Serializable{

	private List<Purchase> purchaseList;

	public UserPurchaseForm() {
		purchaseList = new ArrayList();
	}

	public UserPurchaseForm(List<Purchase> purchaseList) {
		super();
		this.purchaseList = purchaseList;
	}

	public List<Purchase> getpurchaseList(String userId) {
		return purchaseList;
	}

	public void setpurchaseList(List<Purchase> purchaseList) {
		this.purchaseList = purchaseList;
	}
	
	
}
