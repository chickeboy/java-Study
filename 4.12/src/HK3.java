import java.util.Scanner;

/*3.��ɹ�����Ʒ���㹦�ܣ�
ѭ��������Ʒ��ź͹����������������ѽ��ۼӵ��ܽ��
���롰n����ʼ���ˣ�������8�ۣ�
����ʵ������������*/
public class HK3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("=======����С��Ʒ=======");
		System.out.println("Ǧ��                       25Ԫ");
		System.out.println("��Ƥ                       15Ԫ");
		System.out.println("�ֱ�                       200Ԫ");
		double sum = 0;
		while (true) {
			System.out.println("����������Ҫ����Ʒ��");
			String str = scanner.next();
			char ch = str.charAt(0);
			if (ch!='n') {
				System.out.println("����������Ҫ������");
				int b = scanner.nextInt();
				if (str.equals("Ǧ��")) {
					sum = sum + b * 25;
				} else if (str.equals("��Ƥ")) {
					sum = sum + b * 15;
				} else if (str.equals("�ֱ�")) {
					sum = sum + b * 200;
				}
			}else {
				sum = sum * 0.8;
				System.out.println("��������Ǯ����");
				double c = scanner.nextDouble();
				System.out.println("ʵ������" + c + "Ԫ");
				System.out.println("����" + (c - sum));
				break;
			}
		}
	}
}
