package homeWork;

import java.util.Scanner;

/*编写一个方法，可以求出2个数的差，并且调用求出3个数的差*/
public class HK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a + "-" + b + "=" + sum(a, b));
		System.out.println(sum(a, b) + "-" + b + "=" + sum(sum(a, b), b));
	}
	public static int sum(int a, int b) {
		return a - b;
	
	}

}
