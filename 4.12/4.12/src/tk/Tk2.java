package tk;

import java.util.Scanner;

/*
 * �Ӽ�������һ�����������ж����Ƿ�������
 * ֻ�ܱ��Լ���1����������������
 * ��С��������2
 * 8
 * 2 3 4 5 6 7
 */
public class Tk2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = scanner.nextInt();
		boolean isSu = true;
		if(num<2) {
			isSu = false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isSu = false;
				break;
			}
		}
		if (isSu) {
			System.out.println(num + "������");
		} else {
			System.out.println(num + "��������");
		}
	}
}
