package homeWork;

import java.util.Scanner;

/*�Ӽ�������5��������һά�����У�����벿�ֵ�Ԫ��ֵȡ���������´���������У����������Ԫ�ء�*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double arry[] = new double[5];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
		}
		for(int i = 0;i<arry.length;i++) {
			if(i<2) {
				for(int j = 0;Math.pow(10, j)<arry[i];j++) {
					arry[i] = Math.pow(arry[i], -1);
				}
			}
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}

}
