package tk;

import java.util.Scanner;

/*
 * �ж�������֮���Ƿ����100
 */
public class Tk2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������a");
		int a = scanner.nextInt();
		System.out.println("������b");
		int b = scanner.nextInt();
		int sum = a + b;
		if (sum > 100) {
			System.out.println(a + "+" + b + "�ĺʹ���100");
		} else {
			System.out.println("������100");
		}
	}
}
