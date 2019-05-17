package tk;

import java.util.Scanner;

/*
 * 键盘输入3个数，请升序输出
 */
public class Tk13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		// 假设第一个数是最大的
		int max = scanner.nextInt();
		System.out.println("请输入一个数");
		// 假设第二个数是最小的
		int min = scanner.nextInt();
		if (min > max) {
			int temp = max;
			max = min;
			min = temp;
		}
		// 这里已经确定了max的值大于或者等于min中的值
		System.out.println("请输入一个数");
		int mid = scanner.nextInt();
		if (mid < min) {
			int temp = mid;
			mid = min;
			min = temp;
		}
		if (mid > max) {
			int temp = mid;
			mid = max;
			max = temp;
		}
		System.out.println(min + "," + mid + "," + max);
	}
}
