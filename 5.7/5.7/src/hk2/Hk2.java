package hk2;

/*
 * 写一个方法void judge(int a, int b, int c)，
 * 判断三个参数是否能构成一个三角形，
 * 如果不能抛出异常IllegalArgumentException，
 * 显示异常信息a，b，c+“不能构成三角形”，
 * 如果可以构成则显示三角形三个边长，
 * 在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常
 */
public class Hk2 {
	public static void main(String[] args) {
		U u = new U();
		try {
			u.judge(1, 1, 5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class U {
	public void judge(int a, int b, int c) {
		if (a + b <= c || a + c <= b || b + c <= a) {
			throw new IllegalArgumentException(a + "," + b + "," + c + "不能构成三角形");
		}
		System.out.println(a + "," + b + "," + c);
	}
}
