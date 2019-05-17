package tk;

import java.util.Scanner;

/*
 * 键盘输入x的值，根据以下图片得出y的值
 * 
 */
public class Tk6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入x的值");
		int x = scanner.nextInt();
		int y = 0;// 表示了x大于0的情况
		if (x < 0) {
			y = -1;
		}
		if (x == 0) {
			y = 0;
		}
		if (x > 0) {
			y = 1;
		}
		System.out.println("y = " + y);
	}
}
