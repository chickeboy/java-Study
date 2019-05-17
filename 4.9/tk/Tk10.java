package tk;

import java.util.Scanner;

/*
 * 键盘输入一个年份，判断该年份是闰年还是平年
 */
public class Tk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 四年一闰，百年不闰，四百年又闰
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}

	}
}
