/*//�ж�������֮���Ƿ����100
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a+b>100){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}*/
/*//�ж�һ�����Ƿ�Ϊż����
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a%2==0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}*/
/*//��������2����,����ϴ��һ����
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a>b){
			System.out.println(a);
		}else if(a == b){
			System.out.println("�������");
		}else{
			System.out.println(b);
		}
	}
}*/
/*//��������һ������������ľ���ֵ
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a > 0 ){
			System.out.println(a);
		}else{
			a= Math.abs(a);
			System.out.println(a);	
		}
	}
}*/
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x>0){
			int y = 1;
		}else if(x == 0){
			int y = 0;
		}else{
			int y = -1;
		}
		System.out.println(y);
	}
}