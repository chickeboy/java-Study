
public class InterfaceDemo {
	public static void main(String[] args) {
	Person person = new Person();
	child child = new child();
	Dog dog = new Dog();
	person.feed(child);
	person.feed(dog);
	}
}
class Person{
	/*
	 * public void feed(child child) { child.eat(); } public void feed(Dog dog) {
	 * dog.eat(); }
	 */
	public void feed(IAbility iAbility) {
		iAbility.eat();
	}
}
interface IAbility{
	//接口中只能放公有的静态常量和抽象方法
	void eat();
}
class child implements IAbility{
	public  void  eat() {
		System.out.println("吃米饭");
	}
}
class Dog implements IAbility{
	public void eat() {
		System.out.println("吃骨头");
	}
}
