package tk2;

/*
 * ����ģʽ:��һ����ֻ������һ��Ψһ�Ķ���ֻ��һ���ڴ�
 */
public class Tk4 {
	public static void main(String[] args) {
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		System.out.println(a1);
		System.out.println(a2);
		B b = new B();
		System.out.println(b.b);
	}
}

//����ʽ������ʽ
class A {
	private static A a = new A();// ���õ�һ������

	private A() {// ��������޷�ͨ�����췽������A�Ķ���

	}

	public static A getInstance() {// �������Ҫ��A�Ķ���
		// ����ͨ��������������õ�
//		if (a == null) {// ��һ�βŻᴴ������
//			a = new A();
//		}
		return a;
	}
}
