package hk3;

public class Number {
	private int number;
	private int count;
	public Number(int number, int count) {
		super();
		this.number = number;
		this.count = count;
	}
	
	public Number(int count) {
		super();
		this.count = count;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Number other = (Number) obj;
		if (count != other.count)
			return false;
		return true;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return number+":"+count;
	}
}
