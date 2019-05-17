package TK1;

public abstract class Dog extends Aimal {
	private String colour;
	private String name = getName();
	private int age = getAge();
	public Dog(String name, int age, String colour) {
		super(name, age);
		this.colour = colour;
	}
	void play() {
		// TODO Auto-generated method stub
		System.out.println("这个是Dog的play方法");
	}

	@Override
	abstract void eat();
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
