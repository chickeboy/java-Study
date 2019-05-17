package tk;

import java.util.Scanner;

/*
 * 从键盘输入一个正整数，判断其是否是素数
 * 只能被自己和1整除的数就是素数
 * 最小的素数是2
 * 8
 * 2 3 4 5 6 7
 */
public class Tk2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int num = scanner.nextInt();
		boolean isSu = true;
		if(num<2) {
			isSu = false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isSu = false;
				break;
			}
		}
		if (isSu) {
			System.out.println(num + "是素数");
		} else {
			System.out.println(num + "不是素数");
		}
	}
}
