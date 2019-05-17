package tk;

/*
 * 如何手动抛异常
 */
public class Tk2 {
	public static void main(String[] args) {
		Util util = new Util();
		int c = 0;
		try {
			c = util.get(3, 0);
		} catch (ArithmeticException e) {
			// ArithmeticException e = new ArithmeticException("你除0了");
			System.out.println(e.getMessage());
		}
		System.out.println(c);
	}
}

class Util {
//如果方法内部代码块有可能出现异常
//写方法的人首先要跑出可能出现的具体异常的对象
	// 然后再方法声明上要显示的写出可能跑出的异常类型
	public int get(int a, int b) throws ArithmeticException {
		if (b == 0) {
			// 如果走到这里18行就不会执行，方法就结束了
			throw new ArithmeticException("你除0了");
		}
		int c = a / b;
		return c;
	}
}
