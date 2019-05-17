package tk1;

import java.util.Scanner;

public class Tk2 {
	public static void main(String[] args) {
		// 具体的引用
		System.out.println("请输入一个小数");
		Scanner scanner = new Scanner(System.in);
		// 保证在接收数据的是否不报错
		String str = scanner.next();
		// 要讲接收的字符串转换成double类型
		// 能转换小数，但是还是不能带字符或者
		try {
			double d = Double.parseDouble(str);
			System.out.println(d);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		// int 和 String的互相转换
		String s = "123";
		int a = 0;
		a = Integer.valueOf(s);// 这里返回的是Integer多了一个自动拆箱的动作
		a = Integer.parseInt(s);// 直接返回int
		s = a + "";
		s = String.valueOf(a);
		// 如何将一个1变成Object类型的1
		int x = 1;
		Integer integer = x;
		Object object = integer;
		System.out.println(object);
	}
}
