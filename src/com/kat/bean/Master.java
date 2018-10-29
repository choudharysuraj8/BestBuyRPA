package com.kat.bean;

public class Master {

	int id;
	String status;
	String session_id;
	int sequence;
	int record_count;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public int getRecord_count() {
		return record_count;
	}
	public void setRecord_count(int record_count) {
		this.record_count = record_count;
	}
	@Override
	public String toString() {
		return "Master [id=" + id + ", status=" + status + ", session_id=" + session_id + ", sequence=" + sequence
				+ ", record_count=" + record_count + "]";
	}
	
}
