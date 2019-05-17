package tk;

/*
  * JAVA中中断代码的意外情况
  * Error:错误，无法解决，一般是由硬件造成的问题
  * Exception:异常,可以通过代码逻辑去修复的
  * 类似于我们以前上课的时候做的笔记，标注代码可能出现问题
  * 异常的捕获一般是在当时无法解决这个问题，但是呢
  * 程序又要走下去，所以会去在某个位置先捕获异常，让程序
  * 后续的功能不受影响
  * 后续尽量要通过代码去解决这个问题
  * 其实异常类中保存的就是形形色色的代码出现报错的错误信息（文字信息）
 */
public class Tk1 {
	public static void main(String[] args) {
		// 我们必须捕获异常
		// 一般将可能出现异常的代码放入到try代码块中
		// 运行的时候可能会出现两种结果
		// 1.代码正常 跳过catch 2.如果出问题的会走到catch代码块中
		try {
			System.out.println(1 / 0);// 直接就去catch中
			// try中的余下代码无法执行
			System.out.println("ff");
		} catch (ArithmeticException e) {
			// 出于代码规范，程序员应该在这里指明可能出现的具体异常
			// Exception e = new ArithmeticException();
			// System.out.println("我爆炸了");
			System.out.println("除0了");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("over");
	}
}
