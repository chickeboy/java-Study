import java.util.Scanner;

/*���������գ��ж���������Ƿ�Ϸ�������Ϸ���ӡ��
����ʱ�䣬������Ϸ�����ӡ�����Ϸ���switch��if���Խ��ʹ�ã�*/

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ոݔ�����");
		int year = scanner.nextInt();
		System.out.println("Ոݔ���·�");
		int month = scanner.nextInt();
		System.out.println("Ոݔ������");
		int days = scanner.nextInt();
		int day = 0;
		boolean bool = false;
		boolean bool1 = false;
		if (month > 0 && month <= 12) {
			bool = true;
		}
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			switch (month) {
			case 2:
				day = 29;
				break;
			}
		} else {
			switch (month) {
			case 2:
				day = 28;
				break;
			}
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		}
		if (days <= day) {
			bool1 = true;
		}
		if (bool && bool1) {
			System.out.println(year + "��" + month + "��" + days + "��");
		} else {
			System.out.println("��ݔ����������`");
		}
	}
}
