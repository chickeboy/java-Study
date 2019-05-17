import java.util.Scanner;

/*生成一个11-20的随机数，键盘输入一个猜测的数字，判断是否和随机数相符，如果相符，打印正确，
 * 如果偏大，打印太大的了，如果偏小打印太小了，如果不在这个范围内
打印输入不合法*/
public class Hk6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b = (int) Math.floor(Math.random() * 10 + 11);
		System.out.println(b);
		while (true) {
			int a = scanner.nextInt();
			if (a < b) {
				System.out.println("小了");
			} else if (a > b) {
				System.out.println("大了");
			} else {
				System.out.println("正确");
				break;
			}
		}
	}
}
