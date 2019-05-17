//
import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		//键盘接收字符串
		String str = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符");
		str = scanner.next();//字符串接收方法
		//字符的接收,没有单独的方法，必须借助字符串
		char c = ' ';
		c = str.charAt(0);//截取第几位的字符
		c = (char)(c + 32);
		c += 32;
		System.out.println("输入的字符是..." + c);
		//(int)c 强制转换成int类型
		//char转成int其实就是转成这个字符对应的Ascii值

	}
}