package ketang;

import java.util.Arrays;
import java.util.Scanner;

/*.��дһ�����������Խ�һ��1-100���ڵ�������ת����������Ӧ�Ķ������������ò���*/
public class TK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����Ҫ1-100��ת��������");
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
