import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������");
		int b = scanner.nextInt();
		System.out.println("���������������");
		int c = scanner.nextInt();
		if(a>b){
			a = a + b;
			b = a - b;
            a = a - b;
		}
		if(b>c){
			b = b + c;
			c = b - c;
            b = b - c;
		}
		if(a>b){
			a = a + b;
			b = a - b;
            a = a - b;
		}
		System.out.println("������ֵΪ" + a + b +c );
	}
}