/*����������
1.���壺��java��ͬһ�����е�2����2�����ϵķ�����ͬһ�����֣�ֻҪ���ǵĲ���������ͬ���ɡ�*/
public class OverlandDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverlandDemo overlandDemo = new OverlandDemo();
		double result;
		overlandDemo.test();
		overlandDemo.test(10);
		overlandDemo.test(10,20);
		result = overlandDemo.test(125.5);
		System.out.println(result);
	}
void test() {
	System.out.println("no paranement");
}
void test(int a) {
	System.out.println("a:" + a);
}
void test(int a ,int b) {
	System.out.println("a and b" + a + b);
}
double test(double a) {
	System.out.println("doble" + a);
	return a*a;
}
}
