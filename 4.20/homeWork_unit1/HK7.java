//��֪ a,b�����ͱ�����д����2��������ֵ�����ĳ���
import java.util.Scanner;
public class HK7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a  =  scanner.nextInt();
		int b = scanner.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+"\t"+b);
	}
}