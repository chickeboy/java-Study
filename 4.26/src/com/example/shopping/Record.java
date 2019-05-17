package com.example.shopping;
//¹ºÎï¼ÇÂ¼id user goods time
public class Record {
	private int id;
	private String user;
	private String good;
	private String time;
	private int totalprice;
	public Record(int id, String user, String good, String time,int totalprice ) {
		super();
		this.id = id;
		this.user = user;
		this.good = good;
		this.time = time;
		this.totalprice = totalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getGood() {
		return good;
	}
	public void setGood(String good) {
		this.good = good;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", user=" + user + ", good=" + good + ", time=" + time + ", totalprice="
				+ totalprice + "]";
	}
}
