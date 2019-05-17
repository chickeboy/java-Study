package tk2;

public class Tk3 {
	public static void main(String[] args) {
		SuperMan man = new SuperMan("超人");
		man.superM();
	}
}

class Man {
	private String name;

	public Man(String name) {
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

class SuperMan extends Man {
	public SuperMan(String name) {
		super(name);
	}

	private class B extends Bird {

	}

	private class Be extends Bear {

	}

	public void superM() {
		B b = new B();
		Be be = new Be();
		b.fly();
		be.power();
	}
}

class Bird {
	public void fly() {
		System.out.println("飞");
	}
}

class Bear {
	public void power() {
		System.out.println("熊的力量");
	}
}
