import java.util.Scanner;

/*��������2���������Һ�һ������(��������+-%����һ��),�ó���Ӧ�Ľ��*/
public class Hk7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int a = scanner.nextInt();
		System.out.println("������һ������");
		int b = scanner.nextInt();
		System.out.println("������һ���������");
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
