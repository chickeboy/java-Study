import java.util.Scanner;

/*��������һ���·ݣ��ж�����·�����Ӧ�ļ���
��ʾ��3,4,5 ����		6,7,8�ļ�	9,10,11�＾		12,1,2����*/
public class Hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���·�");
		int a = scanner.nextInt();
		if (a >= 3 && a <= 5) {
			System.out.println(a + "���Ǵ���");
		} else if (a >= 3 && a <= 5) {
			System.out.println(a + "�����ļ�");
		} else if (a >= 3 && a <= 5) {
			System.out.println(a + "�����＾");
		} else {
			System.out.println(a + "���Ƕ���");
		}
	}

}
