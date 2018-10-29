package com.kat.bean;

public class LogParams {

	public LogParams(String session_id, int masterId, int detailId, int transactionDetailId, int transactionOrderId) {
		super();
		this.session_id=session_id;
		this.masterId = masterId;
		this.detailId = detailId;
		this.transactionDetailId = transactionDetailId;
		this.transactionOrderId = transactionOrderId;

	}

	String session_id;
	int masterId;
	int detailId;
	int transactionDetailId;
	int transactionOrderId;

	public int getMasterId() {
		return masterId;
	}

	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public int getTransactionDetailId() {
		return transactionDetailId;
	}

	public void setTransactionDetailId(int transactionDetailId) {
		this.transactionDetailId = transactionDetailId;
	}

	public int getTransactionOrderId() {
		return transactionOrderId;
	}

	public void setTransactionOrderId(int transactionOrderId) {
		this.transactionOrderId = transactionOrderId;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	
}
