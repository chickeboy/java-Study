package tk;

import java.util.Scanner;

/*
 * ��������3�������������������
 */
public class Tk12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int max = scanner.nextInt();
		System.out.println("������һ����");
		int num2 = scanner.nextInt();
		max = max < num2 ? num2 : max;
		System.out.println("������һ����");
		num2 = scanner.nextInt();
		max = max < num2 ? num2 : max;
		System.out.println(max);
	}
}
