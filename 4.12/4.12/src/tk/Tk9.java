package tk;

import java.util.Scanner;

/*
 * �Ӽ�������һ����������������ǰ���ú����
 */
public class Tk9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = scanner.nextInt();
		while (num > 0) {
			System.out.println(num % 10);
			num /= 10;
		}
	}
}
