package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 7.��һ���Ѿ��ź�������顣������һ������
 * Ҫ��ԭ���Ĺ��ɽ������������С�
 * ��������������жϴ����Ƿ�������һ������
 * ����������һ�������򲻲��롣Ȼ���ٿ��ǲ����м�����������
 * ������Ԫ��֮����������κ���һ��λ��
 */
public class Hk7 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 7, 8 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		if (num > array[array.length - 1]) {
			// ���һ��������������
			System.out.println("���ܲ���");
		} else {
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length - 1] = num;
			Arrays.sort(array);
		}
		for (int i : array) {
			System.out.println(i);
		}

	}
}
