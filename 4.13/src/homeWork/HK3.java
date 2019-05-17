package homeWork;

import java.util.Scanner;

/*从键盘输入5个数存入一维数组中，将右半部分的元素值取相反数后重新存入该数组中，并输出所有元素。*/
public class HK3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double arry[] = new double[5];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
		}
		for (int i = (arry.length+1)/2; i < arry.length; i++) {
					arry[i] = Math.pow(arry[i], -1);
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
