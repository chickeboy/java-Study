package homeWork;

import java.util.Scanner;

/*4.�Ӽ�������5��������һά����a�У��ٽ����е�ֵ���෴��˳���������b�в������*/
public class HK4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		int arry1[] = new int[5];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
		}
		for(int i = 0;i<arry.length;i++) {
			 arry1[4-i] = arry[i];
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.print(arry1[i]+"\t");
		}
	}

}
