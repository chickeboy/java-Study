import java.util.Scanner;

public class Test2 {
	/*
	 * 16.��������һ���·ݣ��ж�����·�����Ӧ�ļ��� ��ʾ��3,4,5 ���� 6,7,8�ļ� 9,10,11�＾ 12,1,2����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���·�");
		int month = scanner.nextInt();
		String season = "����";
		boolean bool = false;
		if(month>0&&month<=12){
			bool = true;
			switch (month) {
			case 6:
			case 7:
			case 8:
				season = "�ļ�";
				break;
			case 9:
			case 10:
			case 11:
				season = "�＾";
				break;
			case 12:
			case 1:
			case 2:
				season = "����";
				break;
			}
		}
		if(bool) {
			
			System.out.println(month+ "����" + season);
		}else {
			System.out.println("�����������");
		}
	}

}
