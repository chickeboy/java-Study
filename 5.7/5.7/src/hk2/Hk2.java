package hk2;

/*
 * дһ������void judge(int a, int b, int c)��
 * �ж����������Ƿ��ܹ���һ�������Σ�
 * ��������׳��쳣IllegalArgumentException��
 * ��ʾ�쳣��Ϣa��b��c+�����ܹ��������Ρ���
 * ������Թ�������ʾ�����������߳���
 * ���������еõ�������������������������ô˷������������쳣
 */
public class Hk2 {
	public static void main(String[] args) {
		U u = new U();
		try {
			u.judge(1, 1, 5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class U {
	public void judge(int a, int b, int c) {
		if (a + b <= c || a + c <= b || b + c <= a) {
			throw new IllegalArgumentException(a + "," + b + "," + c + "���ܹ���������");
		}
		System.out.println(a + "," + b + "," + c);
	}
}
