package tk;

import java.util.Scanner;

/*
 * �Ӽ�������һ���ַ�����@����������Ҫ����ܲ������
 * ������ʹ�ù��߷���
���ܹ���:
1��������ĸ��ת��ΪСд��
2��������ĸ'a'��'y'����ת��Ϊ��һ����ĸ��
3������'z'����ת��Ϊ'a'��
4�������ַ������ֲ��䡣
 */
public class Tk5 {
	public static void main(String[] args) {
		String str = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������");
		str = scanner.next();
		String newStr = "";
		// str.length����,��ʾ������ַ��ж��ٸ�
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '@') {
				break;
			}
			if (c >= 'A' && c <= 'Z') {
				c += 32;// תСд
			}
			if (c >= 'a' && c <= 'y') {
				c += 1;
			} else if (c == 'z') {
				c = 'a';
			}
			newStr += c;
		}
		System.out.println(newStr);
	}
}
