import java.util.Scanner;
public class Test {
	public static void main(String[] aargs){
	Scanner scanner = new Scanner(System.in);//���ü�������Ĺ���
	System.out.println("������һ���ַ���");
	String str = scanner.next();
	char c = str.charAt(0);
	c += 32;//��ͬ��c = (char)(c+32);
	System.out.println("��������ĸΪ" + c);
	}
}