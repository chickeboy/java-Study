package tk;

import java.util.Scanner;

/*
 * ��ѭ��������ĳһ�����Ľ׳�
 */
public class Tk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		double sum = 1;// ����������ʼֵ������0 
		for (int i = num; i > 0; i--) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
