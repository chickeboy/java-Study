package hk1;

import java.util.Scanner;

/*
 * ʹ��˫��ѭ����ӡ��2������������ 4��ֱ��������
 */
public class Hk6 {
	public static void main(String[] args) {
		System.out.println("�����������εĸ�");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
