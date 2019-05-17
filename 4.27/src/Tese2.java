
public class Tese2 {
	/*
	 * .创建一个Animal类，具有属性name,age，
	 * 创建一个Dog类继承与Animal类 具有自己的属性id
	 * 要求父类和子类都编写好自己的有参构造方法，无参构造方法 并且成员属性进行私有化，
	 * 提供相应的set 和 get方法。最后创建一个Dog类的
	 * 对象和一个Animal对象的对象，并且对属性赋值，进行测试
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("张三", 5,1);
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
