package com.example.shopping;
//用户类 id name password money
public class User {
	private int id;
	private String username;
	private String password;
	private int money;
	public User(String username, int money) {
		super();
		this.username = username;
		this.money = money;
	}
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", 用户名" + username + ", 密码：" + password + ", 账户余额：" + money + "]";
	}
}
