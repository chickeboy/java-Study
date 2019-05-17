//¼üÅÌÊäÈë3¸öÊý£¬ÇëÉýÐòÊä³ö
import java.util.Scanner;
public class HK6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a>b){
			int temp = a;
			a = b;
			b = temp;
		}
		if(b>c){
			int temp = b;
			b = c;
			c = temp;
		}
		if(a>c){
			int temp = a;
			a = c;
			c = temp;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	}
}