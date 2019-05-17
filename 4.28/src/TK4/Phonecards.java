package TK4;

public abstract class Phonecards {
	private String name;
	abstract void output();
	public Phonecards(String name) {
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
