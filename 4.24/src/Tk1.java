/*
 * alt + /
 * ctrl + shif + f 自动排版
 * 面向对象 oop
 * 面向对象的本质:就是将世界上的实物都看作是一个
 * 一个的具体实例，然后再代码中通过创建这些
 * 实例，来获取他们身上的行为和属性
 * 从而提升代码的重用性和扩展性
 * 
 * class 类
 * 将具有共性属性和行为的事物归纳成一个类
 * 其实就是抽象提取
 * 一个.java文件中可以存在多个类
 * 但是用public修饰的类只有一个
 * 也就是运行的时候找到的类
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		Person1 person = new Person1();
		person.name = "张三";
		person.age = 11;
		// 对象的实例化过程
		// 创建一个具体的人 名字叫person
		System.out.println(person.name);
		System.out.println(person.age);
		person.eat();
		Person1 person2 = new Person1();
		System.out.println(person2.name);
		System.out.println(person2.age);
		// person 和 person2不是一个人
		/*
		 * 由一个类创建出来的多个变量 具有的属性和行为是一样的 但是属性的具体值 和行为的具体实现 逻辑可能不一样，大家都是独立的
		 */
	}
}

/*
 * 类的组成 属性 静态的特征(全局变量) 
 * 构造方法 动态的动作 普通方法 统称为 行为
 */
class Person1 {
	String name;// name就是一个成员属性，全局变量
	int age;

	public void eat() {
		System.out.println(name + "吃饭");
	}
}
