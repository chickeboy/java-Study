package tk;

import java.util.Arrays;

/*
 * ����Ŀ���
 */
public class Tk4 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 5, 3 };
		// ���鳤��һ��û������
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
			// �� ��array2��i��λ ��:array1��i��λ�ϴ��ֵ
		}
//		int[] a1 = { 1, 2, 4, 2 };
//		int[] a2 = new int[3];
//		for (int i = 0; i < a1.length; i++) {
//			a2[i] = a1[i];
//		}
		// Arrays��ר���ṩ���������һϵ�м�㷽��
		int[] array3 = null;// �����������͵ĳ�ʼֵ����null
		//System.out.println(array3[2]);
		System.out.println(array3);
		// NULL��ʾ������������ڶ��ڴ���û���κ�ָ���ڴ�
		array3 = Arrays.copyOf(array1, array1.length);
		// Arrays.copyOf ��new ��һ������ռ� ����Ϊ array1.length
		// Ȼ��ͨ��array1 �ĵ�ַ�ҵ����ڴ��д������Ȼ��ֵ�����
		// �µ��ڴ��У�Ȼ�󷵻�����ڴ�����õ�ַ �������Լ������ı���
		// array3
	}
}
