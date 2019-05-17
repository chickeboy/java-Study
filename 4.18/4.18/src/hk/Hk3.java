package hk;

import java.util.Scanner;

/*
 * 创建一个字符串数组，长度为4，输入4个学员姓名，
 * 键盘输入姓氏，分别输出该姓氏第一次出现的下标位置，
 * 和最后一次出现的下标位置，如果不存在，则打印不存在
 */
public class Hk3 {
	public static void main(String[] args) {
		String[] array = new String[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入一个名字");
			array[i] = scanner.next();
		}
		System.out.println("请输入一个字符串");
		String name = scanner.next();
		int[] a = new int[array.length];
		int size = 0;// 它既代表新数组实际存放的元素个数
		// 也可以作为我们自定义的下标使用，最大的作用
		// 其实就是当满足一定条件的时候下标才会移动
		for (int i = 0; i < array.length; i++) {// 这个i是控制原来数组的下标
			if (array[i].contains(name)) {
				a[size] = i;// 先取值作为下标
				size++;// 添加成功一个下标移动一次
			}
		}
		// 可能只有一个
		if (size == 0) {
			System.out.println("没有这个人的信息");
		} else if (size == 1) {
			System.out.println(name + "的信息只有一个" + a[0]);
		} else {
			System.out.println(name + "第一次出现在" + (a[0]) + "最后一次出现在" + a[size - 1]);
		}
	}
}
