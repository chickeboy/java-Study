//Scanner 的时候一定需要导入第三方包
import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		//如何接收用户键盘上输入的值，并且保存下来
		//1.创建一个接收数据的工具
		Scanner scanner = new Scanner(System.in);
		//2.提示用户需要输入的内容代表什么
		System.out.println("请输入num1的值");
		//3.创建一个变量，用来保存用户输入的值
		int num1 = 0;
		//4.接收输入的内容，并且保存
		num1 = scanner.nextInt();//scanner 提供了很多工具方法
		//接收键盘上输入的下一个整数数值
		System.out.println("请输入num2的值");
		int num2 = 0;
		num2 = scanner.nextInt();
		int sum = 0;
		sum = num1 + num2;//后台做数学运算
		System.out.println(num1 + "+" + num2 + "=" +sum);
		//浮点型变量的申请 double x = 0.0;
	}
}