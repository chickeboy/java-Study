package tk5;

public class Tk6 {
	public static void main(String[] args) {

	}
}

/*
 * ������д���෽����
 * ͬ��ͬ�� ����ķ����ķ������μ�����С�ڸ���ķ��� 
 * ����ķ�������ֵ���Ͳ��ܴ��ڸ���ķ���ֵ����
 * (��Сֻ���Ǹ��Ӽ̳й�ϵ�Ĵ�С)
 */
class A {
	public Object a() {
		return null;
	}
}

class D extends A {
	@Override
	public B a() {
		return null;
	}
}

class B extends C {

}

class C {

}
