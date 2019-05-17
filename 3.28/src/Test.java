public class Test {
	public static void main(String[] args) {
		Persion persion = new Persion();
		persion.name = "张三";
		Animal animal = new Animal();
		animal.name = "狗";
		Food food = new Food();
		food.name = "骨头";
		persion.feed(animal, food);
	}
}

class Persion {
	String name;
	int age;

	public void feed(Animal animal, Food food) {
		System.out.println(name + "在喂食");
		animal.eat(food);
	}

}

class Animal {
	String name;

	public void eat(Food food) {
		System.out.println(name + "吃" + food.name);
	}
}

class Food {
	String name;
}