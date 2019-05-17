package hk1;

import java.util.Scanner;

/*写一个方法，从键盘输入一个整数，如果输入的不是整数，则提示输入有误，请重新输入，直到输入正确为止。 */
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				int a = scanner.nextInt();
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("输入有误");
				scanner.nextLine();
			}
		}
	}
}