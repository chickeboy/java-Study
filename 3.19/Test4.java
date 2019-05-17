import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三角形的底边");
		int a = scanner.nextInt();
		System.out.println("请输入三角形的高");
		int b = scanner.nextInt();
		float c = a*b/2;
		System.out.println("三角形的面积为：" + c);
	}
}