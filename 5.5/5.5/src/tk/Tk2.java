package tk;

/*
 * ����ֶ����쳣
 */
public class Tk2 {
	public static void main(String[] args) {
		Util util = new Util();
		int c = 0;
		try {
			c = util.get(3, 0);
		} catch (ArithmeticException e) {
			// ArithmeticException e = new ArithmeticException("���0��");
			System.out.println(e.getMessage());
		}
		System.out.println(c);
	}
}

class Util {
//��������ڲ�������п��ܳ����쳣
//д������������Ҫ�ܳ����ܳ��ֵľ����쳣�Ķ���
	// Ȼ���ٷ���������Ҫ��ʾ��д�������ܳ����쳣����
	public int get(int a, int b) throws ArithmeticException {
		if (b == 0) {
			// ����ߵ�����18�оͲ���ִ�У������ͽ�����
			throw new ArithmeticException("���0��");
		}
		int c = a / b;
		return c;
	}
}
