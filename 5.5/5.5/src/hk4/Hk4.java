package hk4;

/*
 * 使用策略模式的设计方式来实现两个数的操作获得相应的结果。
 * 提供四种具体的实施策略，加、减、乘、除操作
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