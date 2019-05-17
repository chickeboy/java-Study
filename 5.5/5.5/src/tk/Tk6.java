package tk;

/*
 *RuntimeException Exception的一个子类
 *  运行时异常，非受查异常:程序员就算不手动抛出
 *  程序执行到这个代码块的时候如果出现异常
 * JVM虚拟机也会帮你抛出异常
 * 直接继承于RuntimeException的子类都是非受查异常
 * Exception
 * 直接继承与Exception除了RuntimeException的子类异常
 * 都是受查异常，在编写代码的时候就强制要求抛出或者捕获的异常
 * ，否则语法不通过，编译异常
 */
public class Tk6 {
	/*
	 * 当我们自己写代码的时候想做笔记 但是我们遇到的异常情况JDK中没有怎么办
	 */
	public static void main(String[] args) {
		new Ut().a(-10);
	}
}

class Ut {
	public void a(int x) {
		if (x < 3) {
			try {
				throw new MyException("不能小于3", x);
			} catch (MyException e) {
				System.out.println(e);
			}
		}
	}
}

//1.继承Exception 直接成为他的子类，你就是受查异常
//1.你可以被抛出  throw
//2.自定义异常可以有自己的成员属性
class MyException extends Exception {
	private int num;// 表示的是出错的数字

	public MyException(String name, int num) {
		super(name);
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {	
		this.num = num;
	}

	@Override
	public String toString() {
		return "传入的数字小于3不满足条件，它是.." + num;
	}

}
