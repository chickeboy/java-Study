import java.util.Scanner;

/*10.����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���*/
public class Hk10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		String str = scanner.nextLine();
		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i);
			if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
				b += 1;
			} else if (a == 32) {
				c += 1;
			} else if (a >= 48 && a <= 57) {
				d += 1;
			} else {
				e += 1;
			}
		}
		System.out.println(str);
		System.out.println("Ӣ����ĸ������" + b + "�ո������" + c + "���ָ�����" + d + "�����ַ�������" + e);
	}

}
