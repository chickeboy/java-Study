package tk;

import java.util.Scanner;

/*
 * ��������2����,����ϴ��һ����
 */
public class Tk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int max = scanner.nextInt();// �����һ�����ǽϴ��
		System.out.println("������һ����");
		int num2 = scanner.nextInt();
		if (num2 > max) {//�������ʵ������ڶ�����Ҫ�ϴ�
			max = num2;
		}
		System.out.println("�ϴ������..." + max);
		//max����ľ��ǽϴ����

	}
}
