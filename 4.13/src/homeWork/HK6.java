package homeWork;

import java.util.Scanner;

/*�Ӽ�������5��������һά�����У�������������벿�����Ұ벿�ֵ�ֵƽ�ƽ��������´���������в������*/
public class HK6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			int b = 0;
			b = arry[i];
			arry[i] = arry[4 - i];
			arry[4 - i] = b;
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
	}

}
