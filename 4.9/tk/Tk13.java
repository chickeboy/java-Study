package tk;

import java.util.Scanner;

/*
 * ��������3���������������
 */
public class Tk13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		// �����һ����������
		int max = scanner.nextInt();
		System.out.println("������һ����");
		// ����ڶ���������С��
		int min = scanner.nextInt();
		if (min > max) {
			int temp = max;
			max = min;
			min = temp;
		}
		// �����Ѿ�ȷ����max��ֵ���ڻ��ߵ���min�е�ֵ
		System.out.println("������һ����");
		int mid = scanner.nextInt();
		if (mid < min) {
			int temp = mid;
			mid = min;
			min = temp;
		}
		if (mid > max) {
			int temp = mid;
			mid = max;
			max = temp;
		}
		System.out.println(min + "," + mid + "," + max);
	}
}
