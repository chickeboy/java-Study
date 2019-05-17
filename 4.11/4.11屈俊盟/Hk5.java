package hk;
//5.从键盘输入一个正整数，将该数前后倒置后输出
import java.util.Scanner;

public class Hk5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数值");
		int num = scanner.nextInt();
		int b = 1;
		for (int i = 0;; i++) {
			b = num / (int) Math.pow(10, i) % 10;
			if (Math.pow(10, i) > num) {
				break;
			}
			System.out.print(b);
		}
	}
}