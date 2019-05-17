package TK2;
abstract class Electricalappliances {
	private String name;
	private String state;
	abstract void change(String name);
	public Electricalappliances(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
