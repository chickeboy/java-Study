package tk;

import java.util.Scanner;

/*
 * ��������һ������������ľ���ֵ
 */
public class Tk5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		int res = num;//��Ϊ����ֵ���ֵı���
		// ֻҪ���Ǹ���
		if (num < 0) {
			res = -res;
		}
		System.out.println(num +"�ľ���ֵ��..." + res);
	}
}
