//��������һ��Сд��ĸ�����������Ӧ�Ĵ�д��ĸ
import java.util.Scanner;
public class HK6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char a = str.charAt(0);
		a -=32;
		System.out.println(a);
	}
}