package homeWork;

import java.util.Scanner;

/*��д��k!�ķ������ٵ��øú�����10!�����*/
public class HK8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		System.out.println(factorial(k));
	}
	public static double factorial(int k) {
		int b=1;
		for(int i = 1;i<=k;i++) {
			b = b*i;
		}
		return b;
	}

}
