package hk1;

import java.util.Random;
import java.util.Scanner;

/*
 * 2.����һ��������Ʒ���»
�����
�������һ�����ӵļ۸�2000-10000֮�䣩��
�û�ȥ���¼۸������5���ڲ¶Լ۸񣬱�ɻ�ô���Ʒ����
����5�Σ���ʾ���ܿ�ϧ����û�л�ý�Ʒ�����½���������
��5���ڲ¶ԵĻ�����ʾ����ϲ�㣬����˴˽�Ʒ������
 */
public class Hk2 {
	public static void main(String[] args) {
		// 1.��һ�������
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int price = random.nextInt(8001) + 2000;
		System.out.println(price);
		int count = 0;// ��¼�û�����Ĵ���
		while (true) {
			System.out.println("����һ���۸�");
			int userPrice = scanner.nextInt();
			// ����ļ۸��ʵ�ʵļ۸�ƥ��
			if (userPrice > 10000 || userPrice < 2000) {
				System.out.println("������һ��2000-10000�ļ۸�");
			} else if (userPrice == price) {
				System.out.println("��ϲ������");
				break;
			} else {// �´��˺Ͳ�С����ʵ���Ǵ���һ��
				count++;
				if (userPrice > price) {
					System.out.println("�´���");
				} else {
					System.out.println("��С��");
				}
				System.out.println("��ʣ��...." + (5 - count) + "��");
				if (count == 5) {
					System.out.println("�´��˳���5��");
					break;
				}
			}
		}

	}
}
