package hk;

import java.util.Scanner;

/*
 * 创建一个字符串数组，长度为4，输入4个学员姓名，
 * 键盘输入姓氏，请输出所有该姓氏的学员信息
 */
public class Hk2 {
	public static void main(String[] args) {
		String[] array = new String[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入一个名字");
			array[i] = scanner.next();
		}
		System.out.println("请输入一个字符串");
		String name = scanner.next();
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(name)) {// 只能查询完整匹配的值
				System.out.println(array[i]);
			}
		}
	}
}
