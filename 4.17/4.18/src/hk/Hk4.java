package hk;

import java.util.Random;

/*
 * �������40��10��50��������
 * ͳ��ÿ�����ָ����ּ��Σ�����0�ε����ֲ���ӡ
 * key   				value
 * ���ֵ����� Ψһ��             ���Ա仯��
 */
public class Hk4 {
	public static void main(String[] args) {
		// 1.��������
		int[] array = new int[40];
		// 2.���������и�ֵ
		// 3.�����
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(41) + 10;// 0 - 40�������
		}
		for (int i = 10; i < 51; i++) {
			// ����ѭ��i��ֵȥƥ����ѭ�����������е���
			int count = 0;// ������ѭ��ÿһ��ִ�ж�������һ���µı���
			// ��Ϊ�������ʱ��ͳ�Ƶ�ÿһ����ֵ������Ҫ����
			for (int j = 0; j < array.length; j++) {
				// ��ÿ����ѭ��ִ��һ�Σ�����ȥ��iȥƥ��������ÿ��λ��
				if (i == array[j]) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + "������...." + count + "��");
			}
		}
	}
}
