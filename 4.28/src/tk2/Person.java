package TK2;

public class Person {
	private String name;
	public void change(Electricalappliances electricalappliances) {
		electricalappliances.change(name);
	}
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
