import java.util.Scanner;

/*键盘输入年月，判断这一月一共有几天*/
public class Hk8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
			break;
		}
	}
}
