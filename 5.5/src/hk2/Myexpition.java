package hk2;

public class Myexpition  {
	public void judge(int a, int b, int c) throws IllegalAccessException {
		if (a<=0||b<=0||c<=0) {
			throw new IllegalAccessException(a+","+b+","+c+"���ܹ���������");
		}else if (a+b<c||a+c<b|b+c<a) {
			throw new IllegalAccessException(a+","+b+","+c+"���ܹ���������");
		}else {
			System.out.println(a+"\t"+b+"\t"+c);
		}
	}
}