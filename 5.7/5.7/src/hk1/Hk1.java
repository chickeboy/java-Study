package hk1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 写一个方法，从键盘输入一个整数，如果输入的不是整数，
 * 则提示输入有误，请重新输入，直到输入正确为止
 */
public class Hk1 {
	public static void main(String[] args) {
		Util util = new Util();
		util.input();
	}
}

class Util {
	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个数");
			try {
				int num = scanner.nextInt();
				System.out.println(num);
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("请重新输入");
			}

		}
	}
}
