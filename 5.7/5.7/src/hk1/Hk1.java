package hk1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * дһ���������Ӽ�������һ���������������Ĳ���������
 * ����ʾ�����������������룬ֱ��������ȷΪֹ
 */
public class Hk1 {
	public static void main(String[] args) {
		Util util = new Util();
		util.input();
	}
}

class Util {
	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("������һ����");
			try {
				int num = scanner.nextInt();
				System.out.println(num);
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("����������");
			}

		}
	}
}
