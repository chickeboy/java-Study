package hk1;

import java.util.Scanner;

/*
 * 3.��ɹ�����Ʒ���㹦�ܣ�
ѭ��������Ʒ��ź͹����������������ѽ��ۼӵ��ܽ��
���롰n����ʼ���ˣ�������8�ۣ�
����ʵ������������
 */
public class Hk3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double apple = 1;
		double banana = 2;
		double peach = 3;
		double sum = 0;// �ܼ�
		double price = 0;// ����
		while (true) {
			System.out.println("1.ƻ�� 1Ԫ  2.�㽶 2Ԫ 3.���� 3Ԫ");
			System.out.println("������Ҫ�������Ʒ���");
			int id = scanner.nextInt();
			switch (id) {
			case 1:
				price = apple;
				break;
			case 2:
				price = banana;
				break;
			case 3:
				price = peach;
				break;
			default:
				break;
			}
			System.out.println("������Ҫ���������");
			int count = scanner.nextInt();
			sum = count * price;// �����ܼ�
			System.out.println("�����Ƿ�Ҫ����");
			String choice = scanner.next();
			if (choice.equals("n") || choice.equals("N")) {
				break;// ��������ѭ��
			}
		}
		System.out.println("��֧��");
		double pay = scanner.nextDouble();
		sum *= 0.8;// ��8��
		if (pay >= sum) {
			System.out.println("֧���ɹ�,����...." + pay + "���� " + (pay - sum));
		} else {
			System.out.println("ûǮ�͹���");
		}
	}
}
