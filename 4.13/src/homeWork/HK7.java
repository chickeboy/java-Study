package homeWork;

import java.util.Scanner;

/*7.从键盘输入5个数存入一维数组中，求出所有元素的和，并且取平均值，并且输出*/
public class HK7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		double sum = 0;
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
		}
		for (int i = 0; i < arry.length; i++) {
			sum += arry[i];
		}
		System.out.println("和为：" + sum + "平均值为" + sum / 5.0);
	}

}
