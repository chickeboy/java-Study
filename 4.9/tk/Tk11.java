package tk;

import java.util.Scanner;

/*
 * 键盘输入2个数，请升序输出
 */
public class Tk11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int min = scanner.nextInt();
		System.out.println("请输入一个数");
		int max = scanner.nextInt();
		if (max < min) {
			// 用户输入的第二个数要小于第一个数
			// 交换2个变量中保存的值
			int temp = min;// 先保留下一个变量里的值
			min = max;
			max = temp;//必须掌握
		}
		System.out.println(min + "," + max);
	}
}
