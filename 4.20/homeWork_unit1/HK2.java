//���������˺ţ����룬���������Ӧ���˺����루PS�˺ŵ�����ĸ��ʾ������������*����
import java.util.Scanner;
public class HK2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String pasd = scanner.next();
		char a = name.charAt(0);
		System.out.print("�˺ţ�"+a);
		for(int i = 0;i<name.length()-1;i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println("���룺"+pasd);
		
	}
}