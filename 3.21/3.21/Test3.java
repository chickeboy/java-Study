public class Test3{
	public static void main(String[] args){
		//关于变量的使用,计算机中所有的变量都需要为其申请内存空间
		//申请内存空间
		//数据类型    变量名    =   初始值
		int num1 = 3;//申请了一个整数类型的变量 num 赋值 0
		int num2 = 4;
		int sum = 0;
		sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
		sum = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + sum);
		sum = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + sum);
		sum = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + sum);
		
	}
}