
public class Dog {

	String brand;
	int age;
	public String toString() {
		return "����" + age + "���" + brand;
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.brand = "�л���԰Ȯ";
		dog.age = 3;
		System.out.println(dog.toString());
	}
}
