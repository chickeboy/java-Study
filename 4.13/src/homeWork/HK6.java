package homeWork;

import java.util.Scanner;

/*从键盘输入5个数存入一维数组中，将该数组中左半部分与右半部分的值平移交换后重新存入该数组中并输出。*/
public class HK6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			int b = 0;
			b = arry[i];
			arry[i] = arry[4 - i];
			arry[4 - i] = b;
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
	}

}
