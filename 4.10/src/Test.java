import java.util.Scanner;

public class Test {
	/*
	 * 10.��������һ���ٷ������������������Ӧ�ĳɼ��ȼ� ��ʾ�� 0 - 60����������E 60 - 70����������D 70 - 80����������C 80 -
	 * 90����������B
	 * 
	 * 90-100��������A
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ٷ�������");
		float a = scanner.nextFloat();
		if(a>=0&&a<=100) {
			int b = (int)a/10;
			switch(b) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("E");
				break;
			case 6:
				System.out.println("D");
				break;
			case 7:
				System.out.println("C");
				break;
			case 8:
				System.out.println("B");
				break;
			default:
				System.out.println("A");
				break;
			}
		}else {
			System.out.println("���������������");
		}
	}

}
