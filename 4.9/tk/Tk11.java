package tk;

import java.util.Scanner;

/*
 * ��������2���������������
 */
public class Tk11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int min = scanner.nextInt();
		System.out.println("������һ����");
		int max = scanner.nextInt();
		if (max < min) {
			// �û�����ĵڶ�����ҪС�ڵ�һ����
			// ����2�������б����ֵ
			int temp = min;// �ȱ�����һ���������ֵ
			min = max;
			max = temp;//��������
		}
		System.out.println(min + "," + max);
	}
}
