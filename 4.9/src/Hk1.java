
/*1.键盘输入一个字符，如果是小写字母，转换成大写字母，
 * 如果是大写字母，转换成小写字母，如果都不是，
 * 请转换成它所对应的下一个字符*/
import java.util.Scanner;

public class Hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入");
		String str = scanner.next();
		char a = str.charAt(0);
		int c = a;
		if (a >= 65 && a <= 90) {
			c += 32;
		} else if (a >= 97 && a <= 122) {
			c -= 32;
		} else {
			c += 1;
		}
		System.out.println((char) c);
	}

}
