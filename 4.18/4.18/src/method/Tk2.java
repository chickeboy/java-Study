package method;

public class Tk2 {
	public static void main(String[] args) {
		// �����ǵ�һ������ִ�н����Ժ�ֱ�ӿ������һ���̶����
		// ��ô���ʱ����Ҫ����ֵ
		// ���������������ǵ�����ֻ��Ҫһ�����
		// ������ɵ������Լ������ʱ�򣬾���Ҫ����ֵ
		int a = 4;
		int b = 5;
		int c = getSum(a, b);// ���ľ���a �� b�����ĳ���ֵ����
		System.out.println(a + "," + b);
		System.out.println("���Ľ����" + c);
		c = getSum(1, 2);
		System.out.println("�����" + c);
	}

	// getSum(int a, int b) ������ + �����б��Ϊ����ǩ��
	public static int getSum(int a, int b) {
		System.out.println(a + "���뷽����" + b);
		a = 10;
		b = 11;
		int c = a + b;
		return c;// ������ǰ���������ص���c�еĳ���ֵ
	}
}
