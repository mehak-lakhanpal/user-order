package com.nagarro.uo.entity.response;

import java.util.List;

public class UoUserOrderRes {
	
	private UoUserRes userDetails;
	private List<UoOrderRes> orders;
	
	public UoUserRes getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UoUserRes userDetails) {
		this.userDetails = userDetails;
	}
	public List<UoOrderRes> getOrders() {
		return orders;
	}
	public void setOrders(List<UoOrderRes> orders) {
		this.orders = orders;
	}
}
