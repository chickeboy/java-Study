package homeWork;

import java.util.Scanner;

/*�Ӽ�������5��������һά�����У����Ұ벿�ֵ�Ԫ��ֵȡ�෴�������´���������У����������Ԫ�ء�*/
public class HK3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double arry[] = new double[5];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
		}
		for (int i = (arry.length+1)/2; i < arry.length; i++) {
					arry[i] = Math.pow(arry[i], -1);
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
