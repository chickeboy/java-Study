package tk;

import java.util.Scanner;

/*
 * 判断一个数是否为偶数。
 */
public class Tk3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		String str = "不是";
		if (num % 2 == 0) {
			str = "是";
		}
		//str在%2!=0保持原有值"不是"
		System.out.println(num + str + "偶数");
	}
}
