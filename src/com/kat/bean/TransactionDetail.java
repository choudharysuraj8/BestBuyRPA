package com.kat.bean;

public class TransactionDetail {

	int transactionDetailId;
	String transactionStatus;
	String trackingStatus;
	String transactionNumber;
	String trackingNumber;

	public int getTransactionDetailId() {
		return transactionDetailId;
	}

	public void setTransactionDetailId(int transactionDetailId) {
		this.transactionDetailId = transactionDetailId;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTrackingStatus() {
		return trackingStatus;
	}

	public void setTrackingStatus(String trackingStatus) {
		this.trackingStatus = trackingStatus;
	}
	
	

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	@Override
	public String toString() {
		return "TransactionDetail [transactionDetailId=" + transactionDetailId + ", transactionStatus="
				+ transactionStatus + ", trackingStatus=" + trackingStatus + ", transactionNumber=" + transactionNumber
				+ ", trackingNumber=" + trackingNumber + "]";
	}
}
