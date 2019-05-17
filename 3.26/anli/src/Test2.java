import java.util.Scanner;

/*
 * 创建一个数组，长度由用户确定，字符串数组
 * 然后手动添加数组中的内容，字符串长度超过3不能存入
 * 遍历输出整个数组
 */
public class Test2 {
	public static void main(String[] args) {
		// 1.创建数组，初始长度为init
		int init = 0;// 数组的长度
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数组长度");
		init = scanner.nextInt();
		String[] array = new String[init];
		// 2.数组的赋值
		for (int i = 0; i < array.length;) {
			System.out.println("请输入一个字符串");
			String str = scanner.next();
			if (str.length() > 3) {
				System.out.println("输入的长度有误");
			} else {
				array[i] = str;
				i++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
