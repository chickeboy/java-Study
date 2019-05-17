package hk5;

import java.util.Scanner;

public class Array {
	public int array(int i) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int array;
		System.out.println("录入数据，输入quit结束录入");
		String str = scanner.next();
			int index = i;
			if (str.equals("quit")) {
				if (index<4) {
					throw new ArrayIndexOutOfBoundsException("你输入了少于五个数");
				}
			}
			try {
				array = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				throw new NumberFormatException("请输入整数");
			}
		return array;
	}
}
