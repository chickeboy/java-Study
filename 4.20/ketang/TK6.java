package ketang;

import java.util.Scanner;

/*编写一个方法，用于判断2个字符串的长度，返回长度较大的数组，
如果长度相同，则判断从第一位开始的字母，如果某一位的字母字典顺序较大，
则直接判断为较大数组，调用测试*/

public class TK6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个字符串");
		String str = scanner.next();
		System.out.println("输入第二个字符串");
		String str1 = scanner.next();
		System.out.println(tocompare(str, str1));
	}
	public static char[] tocompare(String str, String str1) {
		if (str.length() == str1.length()) {
			char array[] = str.compareTo(str1) > 0 ? str.toCharArray() : str1.toCharArray();
			return array;
		} else {
			char array[] = str.length() > str1.length() ? str.toCharArray() : str1.toCharArray();
			return array;
		}
	}

}
