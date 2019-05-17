package homeWork;

import java.util.Scanner;

/*从键盘输入一个正整数，将该数前后倒置后输出*/
public class HK5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = 0;
		for (int i = 0; true; i++) {
			b = a / (int) Math.pow(10, i) % 10;
			if (Math.pow(10, i)>a) {
				break;
			}
			System.out.print(b);
		}
	}

}
