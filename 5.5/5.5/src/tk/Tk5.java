package tk;

/*
 * �쳣�����׹淶
 *�쳣������ף�������ĳһ������Ҫô����
 *Ҫô���������ף��������ղ����׸������
 *�ᵼ�·����ж�
 */
public class Tk5 {
	public static void main(String[] args) {
		A a = new A();
		a.a(0);
	}
}

class A {
	public void a(int x) throws ArithmeticException {
		B b = new B();
		b.b(x);
	}
	// A���ʱ�����2��ѡ����
	// 1.ֱ����a�����в���b���쳣
	// 2.����������
}

class B {
	public void b(int x) throws ArithmeticException {
		if (x == 0) {
			throw new ArithmeticException();
		}
	}
}
