package homeWork;

import java.util.Scanner;

/*4.从键盘输入5个数存入一维数组a中，再将其中的值按相反的顺序存入数组b中并输出。*/
public class HK4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		int arry1[] = new int[5];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
		}
		for(int i = 0;i<arry.length;i++) {
			 arry1[4-i] = arry[i];
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.print(arry1[i]+"\t");
		}
	}

}
