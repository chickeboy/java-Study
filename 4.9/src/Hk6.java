import java.util.Scanner;

/*����һ��11-20�����������������һ���²�����֣��ж��Ƿ����������������������ӡ��ȷ��
 * ���ƫ�󣬴�ӡ̫����ˣ����ƫС��ӡ̫С�ˣ�������������Χ��
��ӡ���벻�Ϸ�*/
public class Hk6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b = (int) Math.floor(Math.random() * 10 + 11);
		System.out.println(b);
		while (true) {
			int a = scanner.nextInt();
			if (a < b) {
				System.out.println("С��");
			} else if (a > b) {
				System.out.println("����");
			} else {
				System.out.println("��ȷ");
				break;
			}
		}
	}
}
