/*方法的重载
1.定义：在java中同一个类中的2个或2个以上的方法有同一个名字，只要他们的参数声明不同即可。*/
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
