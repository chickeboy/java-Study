package HK3;

/*编写Java程序，模拟简单的计算器。
定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。
编写构造方法，赋予n1和n2初始值，再为该类定义加（addition）、减（subtration）、
乘（multiplication）、除（division）等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。
在main方法中创建Number类的对象，调用各个方法，并显示计算结果。（构造方法）*/
public class HK3 {
	public static void main(String[] args) {
		
		Number number = new Number(5, 6);
		System.out.println(number.addition());
		System.out.println(number.subtration());
		System.out.println(number.multiplication());
		System.out.println(number.division());
	}
	
}
