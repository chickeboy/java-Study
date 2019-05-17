package hk5;

import java.util.Scanner;

/*
 * 从命令行得到5个整数，放入一个整型数组，
 * 然后打印输出，要求：如果输入数据不为整数，
 * 要捕获Integer.parseInt()产生的异常，显示“请输入整数”，
 * 捕获输入数参数不足5个的异常（数组越界），
 * 显示“请输入至少5个整数”
 */
public class Hk5 {
	public static void main(String[] args) {
		int[] array = new int[5];
		U u = new U();
		try {
			u.init(array);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

class U {
	public void init(int[] array) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入一个整数");
			String str = scanner.next();
			try {
				int num = Integer.parseInt(str);
				array[size++] = num;
			} catch (NumberFormatException e) {
				System.out.println("输入的不是整数");
			}
		}
		if (size != 5) {
			throw new IndexOutOfBoundsException("数组长度不为5");
		}
	}
}
