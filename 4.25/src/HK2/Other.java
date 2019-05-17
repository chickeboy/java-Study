package HK2;

public class Other {
	static int a ;
	static double b;
	static boolean bool;
	public Other(int a,int b) {
		if(a>b) {
			this.a = a;
		}
		this.a =b;
	}
	public Other(double a,double b,double c) {
		super();
		this.b = a*b*c;
	}
	public Other(String str,String str1) {
		super();
		this.bool = str.equals(str1);
	}
	@Override
	public String toString() {
		return "Other [a=" + a + ", b=" + b + ", bool=" + bool + "]";
	};
	
}
