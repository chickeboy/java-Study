package homeWork;

import java.util.Scanner;

/*9.����һ�����飬����Ϊ5������ֻ�ܴ������������Ǹ���������ʾ�޷�¼�룬Ҫ���û�һ��Ҫ¼��5�����ݣ���֤�����д���5���Ϸ����ݣ�*/
public class HK9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for(int i = 0;i<arry.length;) {
			System.out.println("������ڣ�"+(i+1)+"������");
			int a = scanner.nextInt();
			if(a<0) {
				System.out.println("��������");
			}else {
				arry[i] = a;
				i++;
			}
		}
	}

}
