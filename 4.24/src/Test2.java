
public class Test2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.out();
		animal.name = "����";
		animal.age = 5;
		animal.out();
	}
}
class Animal{
	String name = "ʨ��";
	int age = 5;
	public void out() {
		System.out.println(name + age+"��");
	}		
}
