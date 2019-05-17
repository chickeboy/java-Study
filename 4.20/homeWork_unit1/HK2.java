//键盘输入账号，密码，并且输出对应的账号密码（PS账号的首字母显示，后续内容用*代替
import java.util.Scanner;
public class HK2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String pasd = scanner.next();
		char a = name.charAt(0);
		System.out.print("账号："+a);
		for(int i = 0;i<name.length()-1;i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println("密码："+pasd);
		
	}
}