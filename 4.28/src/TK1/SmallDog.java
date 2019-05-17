package TK1;

public class SmallDog extends Dog {

	public SmallDog(String name, int age, String colour) {
		super(name, age, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() +  "ºÈÅ£ÄÌ");
	}

}
