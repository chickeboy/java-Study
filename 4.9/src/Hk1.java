
/*1.��������һ���ַ��������Сд��ĸ��ת���ɴ�д��ĸ��
 * ����Ǵ�д��ĸ��ת����Сд��ĸ����������ǣ�
 * ��ת����������Ӧ����һ���ַ�*/
import java.util.Scanner;

public class Hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������");
		String str = scanner.next();
		char a = str.charAt(0);
		int c = a;
		if (a >= 65 && a <= 90) {
			c += 32;
		} else if (a >= 97 && a <= 122) {
			c -= 32;
		} else {
			c += 1;
		}
		System.out.println((char) c);
	}

}
