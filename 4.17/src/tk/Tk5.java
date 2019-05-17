package tk;

import java.util.Scanner;

/*
 * 通过下标获取值
 * 通过值获取下标 
 */
public class Tk5 {
	public static void main(String[] args) {
		int[] array = { 2, 4, 5, 6, 21 };// 没有重复数据的数组
		System.out.println("请输入你要查找的数");
		// 判断这个数是否在数组中
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();// 用户要查的数
		// 拿着这个数到数组中每个位置上进行匹配
		// 线性遍历 从0到尾
		int index = -1;// 下标是不会出现-1的
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				index = i;// 将下标赋值给index
				break;// 因为没有重复的，所以一旦找到，直接退出
			}
		}
		if (index == -1) {// 表示循环里面的if根本没有判断成功
			System.out.println(num + "不存在");
		} else {
			System.out.println(num + "出现在 " + index + "下标位");
		}

	}
}
