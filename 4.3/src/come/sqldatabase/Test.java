package come.sqldatabase;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int b = scanner.nextInt();
			if (b == 1) {
				manager.show();
			}else if(b==2) {
				manager.INSERT();
			}else if(b==3) {
				manager.DELETE();
			}else {
				manager.UPDATE();
			}

		}
	}
}
