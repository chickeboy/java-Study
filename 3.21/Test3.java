import java.util.Scanner;
public class Test3{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		double num = 0;
		System.out.println("请输入第一个数字");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数字");
		int b = scanner.nextInt();
		System.out.println("请输入一个运算法则");
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
			System.out.println("运算后的值为" + num);
		}else{
			System.out.println("请输入正确的运算符");
		}
		
	}
}