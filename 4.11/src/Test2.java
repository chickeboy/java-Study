import java.util.Scanner;

/*从键盘输入一个正整数n，求1+2+3+...+n之和并输出。*/
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			
			sum = sum + i;
		}
			System.out.println(sum);
	}

}
