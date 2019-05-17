import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数字");
		int b = scanner.nextInt();
		System.out.println("请输入第三个数字");
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
		System.out.println("排序后的值为" + a + b +c );
	}
}