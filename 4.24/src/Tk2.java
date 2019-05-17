/*
 * 局部变量和成员属性的区别
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		Person2 person = new Person2();
		person.name = "aa";// 的
		String name = "王五";
		person.play(name);
		person.name = "bbbbb";
		person.play(name);
		person.play(name);
		Person2 person2 = new Person2();
		person2.name = "bb";
		person2.play(name);
	}
}

class Person2 {
	String name;// 成员属性
	// 局部变量的name每次方法被调用的时候
	// 才会生成，方法结束变量消失
	// 也就是每次方法调用的时候都需要穿一个
	// 新的实参进入到方法

	public void play(String name) {
		// 当出现局部变量和成员属性重名的时候
		// 当前对象的成员属性就用this.去代表和区分
		System.out.println(this.name + "和" + name + "玩");
	}

}