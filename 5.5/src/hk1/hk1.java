package hk1;

import java.util.Scanner;

/*дһ���������Ӽ�������һ���������������Ĳ�������������ʾ�����������������룬ֱ��������ȷΪֹ�� */
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				int a = scanner.nextInt();
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("��������");
				scanner.nextLine();
			}
		}
	}
}