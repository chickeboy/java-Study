
public class Dog {

	String brand;
	int age;
	public String toString() {
		return "这是" + age + "岁的" + brand;
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.brand = "中华田园犬";
		dog.age = 3;
		System.out.println(dog.toString());
	}
}
