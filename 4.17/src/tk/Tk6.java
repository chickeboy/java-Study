package tk;

import java.util.Scanner;

/*
 * 如果数组中出现了重复元素，需要获取下标怎么办
 */
public class Tk6 {
	public static void main(String[] args) {
		String[] array = { "张三", "李四", "张三", "赵六" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查找的学生名字");
		String name = scanner.next();
		int[] nameArray = new int[array.length];
		for (int i = 0; i < nameArray.length; i++) {
			nameArray[i] = -1;// 都赋值-1为了和下标0区分
		}
		// 假设所有的人都叫张三,保留原数组中出现的位置
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (name.equals(array[i])) {
				nameArray[i] = i;
				flag = true;
				// 新数组的下标位置上的元素和下标值一样
				// 数组中会出现有的位置没有被赋值
			}
		}
		if (flag) {
			for (int i : nameArray) {
				if (i != -1) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("没有找到");
		}
	}
}
