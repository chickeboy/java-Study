
public class Cat extends Pet {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(Food food) {
		if (food instanceof Fish) {
			System.out.println(getName() + "���ڳ�" + food.getName());
		} else {
			System.out.println(getName() + "����" + food.getName());
		}
	}

}
