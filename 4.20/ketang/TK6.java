package ketang;

import java.util.Scanner;

/*��дһ�������������ж�2���ַ����ĳ��ȣ����س��Ƚϴ�����飬
���������ͬ�����жϴӵ�һλ��ʼ����ĸ�����ĳһλ����ĸ�ֵ�˳��ϴ�
��ֱ���ж�Ϊ�ϴ����飬���ò���*/

public class TK6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ���ַ���");
		String str = scanner.next();
		System.out.println("����ڶ����ַ���");
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
