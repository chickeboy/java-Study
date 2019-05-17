package com.example.shopping;
//物品类id name price count sellcount
public class Goods {
	private int id;
	private String name;
	private int price;
	private int count;
	public Goods(int id) {
		super();
		this.id = id;
	}
	private int sellcount;
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public Goods(int id, String name, int price, int count) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public Goods() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSellcount() {
		return sellcount;
	}
	public void setSellcount(int sellcount) {
		this.sellcount = sellcount;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", 物品名字：" + name + ", 物品价格：" + price + ", 物品数量：" + count + ", 物品销售数量："
				+ sellcount + "]";
	}
	
}
