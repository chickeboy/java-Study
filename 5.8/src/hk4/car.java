package hk4;

public class car {
	private int goodsid;
	private int goodscount;
	private int sumMoney;
	public car(int goodsid, int goodscount,int price) {
		super();
		this.goodsid = goodsid;
		this.goodscount = goodscount;
		this.sumMoney = goodscount*price;
	}
	
	public car(int goodsid) {
		super();
		this.goodsid = goodsid;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		car other = (car) obj;
		if (goodsid != other.goodsid)
			return false;
		return true;
	}

	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public int getGoodscount() {
		return goodscount;
	}
	public void setGoodscount(int goodscount) {
		this.goodscount = goodscount;
	}
	public int getSumMoney() {
		return sumMoney;
	}
	public void setSumMoney(int sumMoney) {
		this.sumMoney = sumMoney;
	}
	@Override
	public String toString() {
		return "car [goodsid=" + goodsid + ", goodscount=" + goodscount + ", sumMoney=" + sumMoney + "]";
	}
	
}
