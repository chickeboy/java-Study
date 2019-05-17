package HK6;

import java.util.Scanner;
public class Util {
	private static Scanner scanner = new Scanner(System.in);
	public static String choice;

	public static boolean isGoOn() {
		System.out.println("ÇëÎÊÊÇ·ñ¼ÌÐø");
		choice = scanner.next();
		if (choice.equals("n")) {
			return false;
		}
		return true;
	}

	public static void show(Student[] stus, String str) {
		System.out.println("===========" + str + "===========");
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] != null) {
				System.out.println(stus[i]);
			}
		}
	}
}
