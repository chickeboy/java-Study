package hk;

import java.util.Scanner;

/*
 * 有一个数列：8，4，2，1，23，344，12
循环输出数列的值
求数列中所有数值的和
猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
 */
public class Hk5 {
	public static void main(String[] args) {
		int[] array = { 8, 4, 2, 1, 23, 344, 12 };
		double sum = 0;
		for (int i : array) {// 不需要下标就能遍历数组
			System.out.println(i);// i 就和之前的array[i]
			// 一样，代表着整个元素是
			sum += i;
		}
		System.out.println("和为" + sum);
		System.out.println("请输入一个数");
		int num = new Scanner(System.in).nextInt();
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				index = i;
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
