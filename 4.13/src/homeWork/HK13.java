package homeWork;

import java.util.Arrays;
import java.util.Scanner;

/*13.����һ���������5�����ݣ�Ȼ��ͨ�����ַ�ʽ��ɶ�����ĸ��ƺ����*/
public class HK13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		int arry1[] = new int[5];
		for(int  i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
			arry1[i] = arry[i];
		}
		int arry3[] = Arrays.copyOf(arry, 5);
		for(int i = 0;i<arry.length;i++) {
			System.out.print(arry[i]+"\t");	
		}
		System.out.println();
		for(int i = 0;i<arry.length;i++) {	
			System.out.print(arry1[i]+"\t");
		}
		System.out.println();
		for(int i = 0;i<arry.length;i++) {
			System.out.print(arry3[i]+"\t");
		}
	}

}
