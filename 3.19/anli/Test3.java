/*
	java中数据的输入
	包：一个文件夹，里面有很多工具类
*/
import java.util.Scanner;//导入一个工具包 油条 烂包 lang
public class Test3{
	public static void main(String[] args){
		//创建一个用来键盘接收数据的工具对象叫做scanner
		//只需要创建一次
		Scanner scanner = new Scanner(System.in);
		//只要涉及到键盘输入内容，必须有提示，这里输入的内容代表什么
		System.out.println("请输入一个整数");
		//如何保存键盘上输入的内容在缓存中
		int num = 0;
		num = scanner.nextInt();//scanner.nextInt();
		//键盘下一个输入的整数
		System.out.println("您输入的数是..." + num);
	}
}