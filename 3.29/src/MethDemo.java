
public class MethDemo {
	public static void main(String[] args) {
		String str = "����";
		MethDemo methDemo = new MethDemo();
		methDemo.method1();
		System.out.println(methDemo.method2());
		methDemo.method3(str);
		System.out.println(methDemo.method4(str,3));
	}
 void method1() {
	 System.out.println("��������Ϊ�����޲����ķ���");
 }
 String method2() {
	 return "���з���ֵ�������޲����ķ���" ;
	 
 }
public void  method3(String name) {
	 System.out.println("��������Ϊ���Ҵ��в����ķ���" +name);
 }
 String method4(String name, int age) {
	 return "���з���ֵ�������в����ķ���" + name + age;
 }
}
