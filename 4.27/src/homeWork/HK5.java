package homeWork;

/*����һ�������࣬��������name,age,colour����Ϊ�г� ��ӡ�Զ���

����һ�����࣬�̳��ڶ���������Լ�����Ϊ��ˣ�������

����һ��С���࣬�̳��ڹ��࣬�Զ�������Ϊ�гԵ���ţ��

����һ�����࣬�̳��ڹ��࣬�ԵĶ��������ͷ

Ҫ���ӡ��С���ʹ󹷵��������ԣ����Ը�ʽΪ������xxx���ҵ���ɫ��xxx���ҵ�������xxx

������Ϊ����ӡ��Ч�� xxx������̣�xxx�ڳ�xxx*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new smallDog("С��", 5, "��ɫ");
		Food1 food = new Milk("ţ��");
		food.eatFood(animal);
		animal = new smallDog("��", 10, "��ɫ");
		food= new Meatbones("���ͷ");
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
		System.out.println(name + "�������");
	}
}

class smallDog extends Dog1 {

	public smallDog(String name, int age, String color) {
		super(name, age, color);
		// TODO Auto-generated constructor stub
		System.out.println("����" + getName() + "��" + "�ҵ���ɫ��" + getColor() + "��" + "�ҵ�������" + getAge());
	}
}

class BigDog extends Dog1 {

	public BigDog(String name, int age, String color, String play) {
		super(name, age, color);
		// TODO Auto-generated constructor stub
		System.out.println("����" + getName() + "��" + "�ҵ���ɫ��" + getColor() + "��" + "�ҵ�������" + getAge());
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
		System.out.println(animal.getName()+"�ڳ�" +name);
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
