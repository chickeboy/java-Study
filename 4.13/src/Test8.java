import java.util.Scanner;

/*键盘输入一个整数，作为数组的长度，创建对应的数组，
 * 要求用户录入4条数据，数组中只能存入正数，负数不能录入，如果录入负数给与提示，输入有误。*/
public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入创建数组长度");
		int a = scanner.nextInt();
		int arry[] = new int[a];
		for (int i = 0; i < arry.length; i++) {
			System.out.println("请输入第" + (i+1) + "个数");
			int b = scanner.nextInt();
			if (b > 0) {
				arry[i] = b;
			} else {
				System.out.println("输入有误");
				i--;
			}
		}
	}
}
