//
import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		//���̽����ַ���
		String str = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�");
		str = scanner.next();//�ַ������շ���
		//�ַ��Ľ���,û�е����ķ�������������ַ���
		char c = ' ';
		c = str.charAt(0);//��ȡ�ڼ�λ���ַ�
		c = (char)(c + 32);
		c += 32;
		System.out.println("������ַ���..." + c);
		//(int)c ǿ��ת����int����
		//charת��int��ʵ����ת������ַ���Ӧ��Asciiֵ

	}
}