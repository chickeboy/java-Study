package homeWork;

import java.util.Scanner;

/*7.�Ӽ�������5��������һά�����У��������Ԫ�صĺͣ�����ȡƽ��ֵ���������*/
public class HK7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		double sum = 0;
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
		}
		for (int i = 0; i < arry.length; i++) {
			sum += arry[i];
		}
		System.out.println("��Ϊ��" + sum + "ƽ��ֵΪ" + sum / 5.0);
	}

}
