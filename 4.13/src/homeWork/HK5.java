package homeWork;

import java.util.Scanner;

/*从键盘输入5个数存入一维数组中，将其中的值前后倒置后重新存入该数组中并输出。*/
public class HK5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
			int sum = 0;
			for (int j = 0; Math.pow(10, j) < arry[i]; j++) {
				sum = sum * 10 + arry[i] / (int) Math.pow(10, j) % 10;

			}
			arry[i] = sum;
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
