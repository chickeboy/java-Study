import java.util.Scanner;

/*�����������£��ж���һ��һ���м���*/
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������");
		int year = scanner.nextInt();
		System.out.println("�������·�");
		int b = scanner.nextInt();
		int days = 0;
		boolean bool = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			bool = true;
		}
		if (b >= 0 && b <= 12) {
			switch (b) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			}
			if (b == 2 && bool) {
				days = 29;
			}
		}
		System.out.println(year + "��" + b + "����" + days + "��");
	}
}
