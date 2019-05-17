package tk;

import java.util.Scanner;

public class Tk7 {
	public static void main(String[] args) {
		String[] array = { "张三", "李四", "张三", "赵六" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查找的学生名字");
		String name = scanner.next();
		int size = 0;// 实际添加成功的下标个数
		int[] nameArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (name.equals(array[i])) {
				nameArray[size++] = i;
			}
		}
		if (size == 0) {
			System.out.println("不存在");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(nameArray[i]);
			}
		}

	}
}
