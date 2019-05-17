//判断一个数是否为偶数
import java.util.Scanner;
public class HK1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String str = a%2==0? "是":"不是";
		System.out.println(a+str+"偶数");
	}
}