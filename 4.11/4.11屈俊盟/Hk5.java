package hk;
//5.�Ӽ�������һ����������������ǰ���ú����
import java.util.Scanner;

public class Hk5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����ֵ");
		int num = scanner.nextInt();
		int b = 1;
		for (int i = 0;; i++) {
			b = num / (int) Math.pow(10, i) % 10;
			if (Math.pow(10, i) > num) {
				break;
			}
			System.out.print(b);
		}
	}
}