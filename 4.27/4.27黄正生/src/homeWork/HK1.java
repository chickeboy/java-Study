package homeWork;

/*有一个主人（Master类），他养了两只宠物（Pet类），
一只宠物是狗（Dog类），名字叫“旺财”，另一只宠物是猫（Cat类），
名字叫“小花”，现在有两种食物（Food类），分别是骨头（Bone）和鱼（Fish）。
主人分别给两只宠物喂食物，两只宠物挑食，狗只吃骨头（如果主人为够吃别的食物，
就显示“狗不吃某某食物”）；猫只吃鱼（如果主人为猫吃别的食物，就显示“猫不吃某某食物”）*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Dog("狗");
		Food food = new Boot("骨头");
		Master master = new Master();
		master.feed(pet, food);
		pet = new Cat( "猫");
		food = new Food("鱼");
		master.feed(pet, food);
		pet = new Cat( "狗");
		food = new Food("鱼");
		master.feed(pet, food);
		pet = new Cat( "猫");
		food = new Food("骨头");
		master.feed(pet, food);
	}

}

class Master {
	public void feed(Pet pet, Food food) {
		// TODO Auto-generated method stub
		String str = "吃" ;
		if((pet.getName().equals("猫")&&food.getName().equals("骨头"))||(pet.getName().equals("狗")&&food.getName().equals("鱼"))) {
			str = "不吃";
		}
		pet.eatfood(food,str);
	}
}

class Pet {
	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eatfood(Food food,String str) {
		// TODO Auto-generated method stub
		System.out.println(name + str + food.getName());
	}
}

class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

class Cat extends Pet {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}

class Food {
	private String name;

	public Food(String name) {
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

class Boot extends Food {

	public Boot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

class Fish extends Food {

	public Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
