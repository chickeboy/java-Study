import java.util.Scanner;

/*
 * ����һ�����飬�������û�ȷ�����ַ�������
 * Ȼ���ֶ���������е����ݣ��ַ������ȳ���3���ܴ���
 * ���������������
 */
public class Test2 {
	public static void main(String[] args) {
		// 1.�������飬��ʼ����Ϊinit
		int init = 0;// ����ĳ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������鳤��");
		init = scanner.nextInt();
		String[] array = new String[init];
		// 2.����ĸ�ֵ
		for (int i = 0; i < array.length;) {
			System.out.println("������һ���ַ���");
			String str = scanner.next();
			if (str.length() > 3) {
				System.out.println("����ĳ�������");
			} else {
				array[i] = str;
				i++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
