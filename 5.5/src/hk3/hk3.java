package hk3;

import java.util.Scanner;

/*��һ�����б�дһ�������������������һ���ַ��������Ƿ����ĳ���ַ���
������ڣ��򷵻�����ַ����ַ������е�һ�γ��ֵ�λ�ã��±꣩��
���򣬷���-1��Ҫ�������ַ�������ַ����Բ�����ʽ���ݸ��÷�����
������������Ϊnull�����׳�IllegalArgumentException�쳣��
�����main�������Ը��ֿ��ܳ��ֵ����������֤�÷�����д���Ƿ���ȷ��
���磺�ַ������ڣ��ַ����ڣ����������Ϊnull��,�����������Ҫ��ӡ���ټ�2���֡� */
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char array[] = null;
		System.out.println("������Ҫ���ҵ��ַ�");
		 String str = scanner.next();
		char a = str.charAt(0);
		A a2 = new A();
		try {
			int b = a2.exception(array,a);
			if (b!=-1) {
				System.out.println(b+"�ټ�");
			}else {
				System.out.println("�ַ�������"+"�ټ�");
			}	
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
