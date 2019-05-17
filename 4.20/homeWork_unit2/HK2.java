//判断三个数之积是否小于50或大于100
import java.util.Scanner;
public class HK2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String str = a*b*c>100||a*b*c<50? "是":"不是";
		System.out.println("三数之积"+str+"小于50或大于100");
	}
}