package hk2;

import java.util.Scanner;

/*дһ������void judge(int a, int b, int c)��
�ж����������Ƿ��ܹ���һ�������Σ���������׳��쳣IllegalArgumentException��
��ʾ�쳣��Ϣa��b��c+�����ܹ��������Ρ���
������Թ�������ʾ�����������߳������������еõ�������������������������ô˷������������쳣�� */
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ����a");
		int a =scanner.nextInt();
		System.out.println("������ڶ�����b");
		int b =scanner.nextInt();
		System.out.println("�������������c");
		int c =scanner.nextInt();
		Myexpition myexpition = new Myexpition();
		try {
			myexpition.judge(a, b, c);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
