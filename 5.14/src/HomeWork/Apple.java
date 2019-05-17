package HomeWork;

public class Apple {
	private int id;

	public Apple(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Æ»¹û"+(id+1);
	}
}
