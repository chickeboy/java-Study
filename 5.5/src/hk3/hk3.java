package hk3;

import java.util.Scanner;

/*在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，
如果存在，则返回这个字符在字符数组中第一次出现的位置（下标），
否则，返回-1。要搜索的字符数组和字符都以参数形式传递给该方法，
如果传入的数组为null，就抛出IllegalArgumentException异常。
在类的main方法中以各种可能出现的情况测试验证该方法编写的是否正确，
例如：字符不存在，字符存在，传入的数组为null等,但是无论如何要打印出再见2个字。 */
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char array[] = null;
		System.out.println("请输入要查找的字符");
		 String str = scanner.next();
		char a = str.charAt(0);
		A a2 = new A();
		try {
			int b = a2.exception(array,a);
			if (b!=-1) {
				System.out.println(b+"再见");
			}else {
				System.out.println("字符不存在"+"再见");
			}	
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
