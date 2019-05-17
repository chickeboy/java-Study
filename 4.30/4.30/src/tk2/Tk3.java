package tk2;

/*
 * 接口和抽象类的区别：
 * 1.关键字不一样 class  interface
 * 2.extends is - a的关系    implements 实现关系
 * 3.抽象类一般会有成员属性 接口中一般只会有抽象方法
 * 4.jdk1.8之前规定接口中只能有抽象方法
 *  但是到了jdk1.8接口中可以存放默认方法
 * 5.接口可以让本身互相之间没有共性的类归纳为一个类
 * 代码上没有产生联系
 * 6.接口可以多实现也可以多继承
 */
public class Tk3 {
	public static void main(String[] args) {

	}
}

class G {
	public void lead(Animal ani) {
		ani.fly();
	}
}

class Animal {
	public void fly() {

	}
}

class P extends Animal {

}

class B extends Animal {

}
