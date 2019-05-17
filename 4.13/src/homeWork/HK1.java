package homeWork;

import java.util.Scanner;

/*从键盘输入5个数存入一维数组中，将下标为奇数的元素值取倒数后重新存入该数组中，并输出所有元素*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double arry[] = new double[5];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
		}
		for(int i = 0;i<arry.length;i++) {
			if(i%2!=0) {
				for(int j = 0;Math.pow(10, j)<arry[i];j++) {
					arry[i] = Math.pow(arry[i], -1);
				}
			}
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}

}
