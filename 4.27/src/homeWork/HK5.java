package homeWork;

/*创建一个动物类，具有属性name,age,colour，行为有吃 打印吃东西

创建一个狗类，继承于动物，并且有自己的行为玩耍，玩飞盘

创建一个小狗类，继承于狗类，吃东西的行为中吃的是牛奶

创建一个大狗类，继承于狗类，吃的东西是肉骨头

要求打印出小狗和大狗的所有属性，属性格式为：我是xxx，我的颜色是xxx，我的年龄是xxx

调用行为，打印出效果 xxx在玩飞盘，xxx在吃xxx*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new smallDog("小狗", 5, "白色");
		Food1 food = new Milk("牛奶");
		food.eatFood(animal);
		animal = new smallDog("大狗", 10, "黑色");
		food= new Meatbones("肉骨头");
		food.eatFood(animal);
	}

}

class Animal {
	private String name;
	private int age;
	private String color;

	public Animal(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Dog1 extends Animal {
	public Dog1(String name, int age, String color) {
		super(name, age, color);
		// TODO Auto-generated constructor stub
		System.out.println(name + "在玩飞盘");
	}
}

class smallDog extends Dog1 {

	public smallDog(String name, int age, String color) {
		super(name, age, color);
		// TODO Auto-generated constructor stub
		System.out.println("我是" + getName() + "，" + "我的颜色是" + getColor() + "，" + "我的年龄是" + getAge());
	}
}

class BigDog extends Dog1 {

	public BigDog(String name, int age, String color, String play) {
		super(name, age, color);
		// TODO Auto-generated constructor stub
		System.out.println("我是" + getName() + "，" + "我的颜色是" + getColor() + "，" + "我的年龄是" + getAge());
	}
}
class Food1{
	private String name;

	public Food1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eatFood(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println(animal.getName()+"在吃" +name);
	}
}
class Milk extends Food1{

	public Milk(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class Meatbones extends Food1{

	public Meatbones(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
