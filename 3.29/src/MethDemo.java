
public class MethDemo {
	public static void main(String[] args) {
		String str = "张三";
		MethDemo methDemo = new MethDemo();
		methDemo.method1();
		System.out.println(methDemo.method2());
		methDemo.method3(str);
		System.out.println(methDemo.method4(str,3));
	}
 void method1() {
	 System.out.println("返回类型为空且无参数的方法");
 }
 String method2() {
	 return "带有返回值类型且无参数的方法" ;
	 
 }
public void  method3(String name) {
	 System.out.println("返回类型为空且带有参数的方法" +name);
 }
 String method4(String name, int age) {
	 return "带有返回值类型且有参数的方法" + name + age;
 }
}
