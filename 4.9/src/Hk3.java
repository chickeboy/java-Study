import java.util.Scanner;

/*��������һ���ٷ������������������Ӧ�ĳɼ��ȼ�
��ʾ��
0 - 60����������E
60 - 70����������D
70 - 80����������C
80 - 90����������B
90 - 100��������A*/
public class Hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ٷ��Ƴɼ�");
		int a = scanner.nextInt();
		char b = 'A';
		if (a >= 0 && a < 60) {
			b = 'E';
		} else if (a >= 60 && a < 70) {
			b = 'D';
		} else if (a >= 70 && a < 80) {
			b = 'C';
		} else if (a >= 80 && a < 90) {
			b = 'B';
		}
		System.out.println(b);
	}

}
