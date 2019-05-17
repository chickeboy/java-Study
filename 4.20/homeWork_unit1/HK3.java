//键盘输入2个数字，分别打印出他们之间通过运算符 > < >= <= != ==得出的结果值
import java.util.Scanner;
public class HK3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);

		
	}
}