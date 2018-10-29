package com.kat.bean;

public class TransactionOrder {

	int orderId;
	int trasactionDetailId;
	int orderCount;
	String url;
	int orderPlaced;
	int orderAvailable;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTrasactionDetailId() {
		return trasactionDetailId;
	}

	public void setTrasactionDetailId(int trasactionDetailId) {
		this.trasactionDetailId = trasactionDetailId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public int getOrderPlaced() {
		return orderPlaced;
	}

	public void setOrderPlaced(int orderPlaced) {
		this.orderPlaced = orderPlaced;
	}

	public int getOrderAvailable() {
		return orderAvailable;
	}

	public void setOrderAvailable(int orderAvailable) {
		this.orderAvailable = orderAvailable;
	}

	@Override
	public String toString() {
		return "TransactionOrder ::[orderId=" + orderId + "]";
	}

}
