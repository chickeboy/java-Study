package tk;

import java.util.Scanner;

/*
 * �ж�������֮���Ƿ�С��50�����100
 */
public class Tk9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int a = scanner.nextInt();
		System.out.println("������һ����");
		int b = scanner.nextInt();
		System.out.println("������һ����");
		int c = scanner.nextInt();
		int sum = a * b * c;
		if (sum > 100 || sum < 50) {
			System.out.println("����Ҫ��");
		} else {
			System.out.println("������Ҫ��");
		}
	}
}
