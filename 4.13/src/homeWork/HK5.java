package homeWork;

import java.util.Scanner;

/*�Ӽ�������5��������һά�����У������е�ֵǰ���ú����´���������в������*/
public class HK5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
			int sum = 0;
			for (int j = 0; Math.pow(10, j) < arry[i]; j++) {
				sum = sum * 10 + arry[i] / (int) Math.pow(10, j) % 10;

			}
			arry[i] = sum;
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
