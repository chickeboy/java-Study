import java.util.Scanner;

/*键盘输入一个月份，判断这个月份所对应的季节
提示：3,4,5 春季		6,7,8夏季	9,10,11秋季		12,1,2冬季*/
public class Hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个月份");
		int a = scanner.nextInt();
		if (a >= 3 && a <= 5) {
			System.out.println(a + "月是春季");
		} else if (a >= 3 && a <= 5) {
			System.out.println(a + "月是夏季");
		} else if (a >= 3 && a <= 5) {
			System.out.println(a + "月是秋季");
		} else {
			System.out.println(a + "月是冬季");
		}
	}

}
