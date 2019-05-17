package method;

public class Tk2 {
	public static void main(String[] args) {
		// 当我们的一个方法执行结束以后，直接可以输出一个固定结果
		// 那么这个时候不需要返回值
		// 当方法结束后我们调用者只需要一个结果
		// 输出是由调用者自己负责的时候，就需要返回值
		int a = 4;
		int b = 5;
		int c = getSum(a, b);// 传的就是a 和 b里面存的常量值拷贝
		System.out.println(a + "," + b);
		System.out.println("最后的结果是" + c);
		c = getSum(1, 2);
		System.out.println("结果是" + c);
	}

	// getSum(int a, int b) 方法名 + 参数列表称为方法签名
	public static int getSum(int a, int b) {
		System.out.println(a + "进入方法后" + b);
		a = 10;
		b = 11;
		int c = a + b;
		return c;// 结束当前方法，返回的是c中的常量值
	}
}
