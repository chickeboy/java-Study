
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
	//�ӿ���ֻ�ܷŹ��еľ�̬�����ͳ��󷽷�
	void eat();
}
class child implements IAbility{
	public  void  eat() {
		System.out.println("���׷�");
	}
}
class Dog implements IAbility{
	public void eat() {
		System.out.println("�Թ�ͷ");
	}
}
