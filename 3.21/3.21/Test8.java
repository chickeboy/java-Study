//
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		//键盘输入一个三位数，倒序输出
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int num = scanner.nextInt();
		//个 十  百   123
		//1.取到3个位置上的数
		int a = num / 100;//精度损失  1
		int c = num % 10;//%取余数
		int b = num / 10 % 10;
		num = c * 100 + b * 10 + a;
		System.out.println(num);
	}
}