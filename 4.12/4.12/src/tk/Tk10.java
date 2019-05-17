package tk;

import java.util.Scanner;

/*
 * 9.从键盘输入账号密码，全部错误，密码错误，账号错误，都给出提示
直到输入正确为止
 */
public class Tk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("账号");
			String name = scanner.next();
			System.out.println("密码");
			String passWord = scanner.next();
			if (name.equals("aa") && passWord.equals("1")) {
				System.out.println("正确");
				break;
			} else if (name.equals("aa")) {// 至少有一个是错的
				System.out.println("密码错误");
			} else if (passWord.equals("1")) {
				System.out.println("账号错误");
			} else {
				System.out.println("全错");
			}
		}
	}
}
