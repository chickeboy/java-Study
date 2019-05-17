package hk;

import java.util.Scanner;

/*
 * 创建一个数组，录入5条数据，键盘输入一个数据，
 * 查询数组中是否存在该数据，
 * 如果存在打印出对应的下标位置，如果不存在，
 * 打印-1（默认数组中存放的数据不重复）
 */
public class Hk1 {
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		// 1.通过循环录入数据
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入");
			array[i] = scanner.nextInt();
		}
		// 2.用户输入一个查询的具体值
		System.out.println("请输入要查询的值");
		int num = scanner.nextInt();
		// 3.通过这个值去数组中每个位置进行匹配
		// 4.创建一个变量index 表示元素出现的下标值
		int index = -1;// 因为下标不会出现负数,只要最后结果
		// 这个index是一个非负数，表示数组中有这个值
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				index = i;// 这里如果被赋值就是找到了
				break;
			}
		}
		if (index != -1) {
			System.out.println(num + "出现在第" + (index + 1) + "位");
		} else {
			System.out.println(num + "不存在");
		}
	}
}
