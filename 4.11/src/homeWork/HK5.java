package homeWork;

import java.util.Scanner;

/*�Ӽ�������һ����������������ǰ���ú����*/
public class HK5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = 0;
		for (int i = 0; true; i++) {
			b = a / (int) Math.pow(10, i) % 10;
			if (Math.pow(10, i)>a) {
				break;
			}
			System.out.print(b);
		}
	}

}
