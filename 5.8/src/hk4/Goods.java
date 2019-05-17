package hk4;

public class Goods {
	private int id;
	private int price;
	public Goods(int id, int price) {
		super();
		this.id = id;
		this.price = price;
	}
	
	public Goods(int id) {
		super();
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", price=" + price + "]";
	}
	
}
