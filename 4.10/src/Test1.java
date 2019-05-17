import java.util.Scanner;

/*键盘输入年月，判断这一月一共有几天*/
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		System.out.println("请输入月份");
		int b = scanner.nextInt();
		int days = 0;
		boolean bool = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			bool = true;
		}
		if (b >= 0 && b <= 12) {
			switch (b) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			}
			if (b == 2 && bool) {
				days = 29;
			}
		}
		System.out.println(year + "年" + b + "月有" + days + "天");
	}
}
