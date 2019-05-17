package hk2;

import java.util.Scanner;

/*写一个方法void judge(int a, int b, int c)，
判断三个参数是否能构成一个三角形，如果不能抛出异常IllegalArgumentException，
显示异常信息a，b，c+“不能构成三角形”，
如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常。 */
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一条边a");
		int a =scanner.nextInt();
		System.out.println("请输入第二条边b");
		int b =scanner.nextInt();
		System.out.println("请输入第三条边c");
		int c =scanner.nextInt();
		Myexpition myexpition = new Myexpition();
		try {
			myexpition.judge(a, b, c);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
