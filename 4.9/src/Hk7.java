import java.util.Scanner;

/*键盘输入2个数，并且和一个符号(符号限于+-%其中一个),得出对应的结果*/
public class Hk7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int a = scanner.nextInt();
		System.out.println("请输入一个数字");
		int b = scanner.nextInt();
		System.out.println("请输入一个运算符号");
		String str = scanner.next();
		char c = str.charAt(0);
		if (c == '+') {
			System.out.println(a + b);
		}
		if (c == '-') {
			System.out.println(a - b);
		}
		if (c == '*') {
			System.out.println(a * b);
		}
		if (c == '/') {
			System.out.println(a / b);
		}
		if (c == '%') {
			System.out.println(a % b);
		}
	}

}
