import java.util.Scanner;
public class Test3{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		double num = 0;
		System.out.println("�������һ������");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������");
		int b = scanner.nextInt();
		System.out.println("������һ�����㷨��");
		String c = scanner.next();
		char d = c.charAt(0);
		boolean flage = true;
		if(d == '+'){
			num = a+b;
		}else if(d == '-'){
			num = a-b;
		}else if(d == '*'){
			num = a*b;
		}else if(d == '/'){
			num = a/b;
		}else{
			flage = false;
		}
		if(flage){
			System.out.println("������ֵΪ" + num);
		}else{
			System.out.println("��������ȷ�������");
		}
		
	}
}