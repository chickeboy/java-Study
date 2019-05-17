//键盘输入一个字符，求出它在ASCII码表中的下一个字符
import java.util.Scanner;
public class HK5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char a = str.charAt(0);
		System.out.println((char)(a+1));
	}
}