package tk;

import java.util.Scanner;

/*
 * ��������x��ֵ����������ͼƬ�ó�y��ֵ
 * 
 */
public class Tk6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������x��ֵ");
		int x = scanner.nextInt();
		int y = 0;// ��ʾ��x����0�����
		if (x < 0) {
			y = -1;
		}
		if (x == 0) {
			y = 0;
		}
		if (x > 0) {
			y = 1;
		}
		System.out.println("y = " + y);
	}
}
