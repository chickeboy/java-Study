public class Test {
	public static void main(String[] args) {
		Persion persion = new Persion();
		persion.name = "����";
		Animal animal = new Animal();
		animal.name = "��";
		Food food = new Food();
		food.name = "��ͷ";
		persion.feed(animal, food);
	}
}

class Persion {
	String name;
	int age;

	public void feed(Animal animal, Food food) {
		System.out.println(name + "��ιʳ");
		animal.eat(food);
	}

}

class Animal {
	String name;

	public void eat(Food food) {
		System.out.println(name + "��" + food.name);
	}
}

class Food {
	String name;
}