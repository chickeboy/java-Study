package tk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ���ֲ���
 * ���ҵ�����Դ�Ǿ��������
 * ��ά����
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		int[] array = { 4, 1, 5, 6, 7, 2, 9, 11, 16 };
		// 1.������ 1 24  5 6 7 9 11 16
		Arrays.sort(array);
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		// ��һҪ���ҵ����ںܺ��棬Ч�ʱȽϵ�
		int start = 0;// ��ʼ��
		int end = array.length - 1;// β���±�
		int middle = 0;// ͨ��������(start + end) / 2
		// �����3��ֵ����Ķ����±꣬ѭ�������ж��п��ܷ����ı�
		int index = -1;
		while (end >= start) {// ==���һ��
			middle = (start + end) / 2;// ��ȡ�������±�
			if (num == array[middle]) {
				index = middle;
				break;
			} else if (num > array[middle]) {
				// ��һ��ѭ��Ӧ������middle�±���ұ�
				// ��ʼ��ͷ����ı�
				start = middle + 1;
			} else {
				// ����� endҪ�仯
				end = middle - 1;
			}
		}
		if (index == -1) {
			System.out.println("û�������");
		} else {
			System.out.println("�����ڵ�" + (index + 1) + "λ");
		}

	}
}
