package tk;

import java.util.Scanner;

/*
 * ��������һ����ݣ��жϸ���������껹��ƽ��
 */
public class Tk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ����һ�򣬰��겻���İ�������
		System.out.println("���������");
		int year = scanner.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}

	}
}
