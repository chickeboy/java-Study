package hk4;

/*
 * ʹ�ò���ģʽ����Ʒ�ʽ��ʵ���������Ĳ��������Ӧ�Ľ����
 * �ṩ���־����ʵʩ���ԣ��ӡ������ˡ�������
 */
public class Hk4 {
	public static void main(String[] args) {

	}
}

class Util {
	public void getSum() {
		Cal cal = new Plus();
		System.out.println(cal.get(3, 4));
		cal = new Mul();
		System.out.println(cal.get(4, 5));
	}
}

interface Cal {
	public double get(double num1, double num2);
}

class Plus implements Cal {

	@Override
	public double get(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}

class Mul implements Cal {

	@Override
	public double get(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

}