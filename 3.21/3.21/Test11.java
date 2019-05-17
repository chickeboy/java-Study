//
import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		double num1 = scanner.nextDouble();
		System.out.println("请输入一个数");
		double num2 = scanner.nextDouble();
		System.out.println("请输入一个符号");
		String str = scanner.next();
		char c = str.charAt(0);
		boolean flag = true;//表示正确的
		double sum = 0;//结果值
		if(c == '+'){
			sum = num1 + num2;
		}else if(c == '-'){
			sum = num1 - num2;
		}else if(c == '*'){
			sum = num1 * num2;
		}else if(c == '/'){
			sum = num1 / num2;
		}else{
			flag = false;//只有在错误的时候flag才会变成false
		}
		if(flag == true){
			System.out.println(num1 + "" + c + num2 + "=" + sum);
		}else{
			System.out.println("输入有误");
		}
	}
}