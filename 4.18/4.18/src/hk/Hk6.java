package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ���ִ�֣��ڸ質�����У�����10λ��ί���д�֣�
 * �ڼ�����ֵ÷�ʱ��ȥ��һ����߷֣�ȥ��һ����ͷ֣�
 * Ȼ��ʣ���8λ��ί�ķ�������ƽ�������Ǹ�ѡ�ֵ����յ÷֡�
 * ����ÿ����ί�����֣���ĳѡ�ֵĵ÷�
 */
public class Hk6 {
	public static void main(String[] args) {
		double[] array = new double[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length;) {
			System.out.println("������һ������");
			double score = scanner.nextDouble();
			if (score > 100 || score < 0) {
				System.out.println("������0-100�ķ���");
			} else {
				array[i] = score;// �����������Ŵ�������
				i++;
			}
		}
		Arrays.sort(array);// ��������ͷ־���0��λ
		// ��߷־���array.length - 1
		double sum = 0;
		for (int i = 1; i < array.length - 1; i++) {
			sum += array[i];
		}
		double avg = sum / (array.length - 2);
		System.out.println("ƽ�����ǡ�������" + avg);
	}
}
