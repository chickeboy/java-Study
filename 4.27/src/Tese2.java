
public class Tese2 {
	/*
	 * .����һ��Animal�࣬��������name,age��
	 * ����һ��Dog��̳���Animal�� �����Լ�������id
	 * Ҫ��������඼��д���Լ����вι��췽�����޲ι��췽�� ���ҳ�Ա���Խ���˽�л���
	 * �ṩ��Ӧ��set �� get��������󴴽�һ��Dog���
	 * �����һ��Animal����Ķ��󣬲��Ҷ����Ը�ֵ�����в���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("����", 5,1);
		System.out.println(dog.toString());
	}

}
class Animal {
	private String name;
	private int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Animal() {
		super();
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
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
}
class Dog extends Animal{
	private int id;

	public Dog(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
