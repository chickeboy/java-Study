package ketang;

import java.util.Arrays;
import java.util.Scanner;

/*.编写一个方法，可以将一个1-100以内的正整数转换成它所对应的二进制数，调用测试*/
public class TK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入要1-100内转化的数字");
		int a = scanner.nextInt();		
		output(binary(a));
	}
	public static int[] binary(int a) {
		int array[] = new int[1];
		int i = 0;
		while(a>=1) {			
			array[i] = a%2;
			i++;
			a = a/2;
			if(i==array.length) {
				array = Arrays.copyOf(array, array.length*2);
			}
		}
		return array;
	}
	public static void output(int array[]) {
		for(int i = array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
	}

}
