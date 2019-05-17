
package homeWork;

import java.util.Scanner;
/*ʹ�÷�����װ����ʽ�����������*/
public class HK10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************ʹ��������**********");
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������");
		int year = scanner.nextInt();
		System.out.println("�������·�");
		int month = scanner.nextInt();
		if (month <= 1 && month >= 12) {
			System.out.println("������·�����");//�ж��·��ǲ��ǺϷ�ֵ������ֱ�ӽ�������
			return;
		}
		String str = isRun(year) ? "����" : "ƽ��";//����isRun�����ж�����ǲ�������
		System.out.println(year + "��" + str);
		outrili(year, month);
	}

	public static boolean isRun(int year) {//�ж�����ƽ��ķ����Ƿ���true���Ƿ���false
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int getsumdays(int year, int month) {//���㱾�·�֮ǰ�����·ݵ������ܺ�
		int sumdays = 0;
		for (int i = 1900; i < year; i++) {//����֮ǰ��������
			if (isRun(year)) {
				sumdays += 366;
			} else {
				sumdays += 365;
			}
		}
		for(int i = 1;i<month;i++) {//���걾�·�֮ǰ��������
			sumdays += days(year,i);//ѭ������days�����õ������ӵ�sumdays����
		}
		return sumdays;
	}

	public static int days(int year, int month) {//����ĳ���·������ķ���
		int days = 0;
		//int sumdays = 0; 
		//for (int i = 0; i < month; i++) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				if (isRun(year)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			}
			return days;
			 //sumdays = sumdays + days; 
		//}
		//return sumdays;
	}

	public static void outrili(int year, int month) {//��ӡ�������ķ���
		int days = days(year, month);//�õ����µ�����
		int befordays =1+getsumdays(year, month)% 7;//�õ��ϸ��µĽ�β�����ڼ�
		if (befordays == 7) {
			befordays = 0;
		}
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������");
		for (int i = 0; i < befordays; i++) {//����1�ſ�ʼ��λ��
			System.out.print("\t");
		}
		for (int i = 1; i <= days; i++) {//�������
			System.out.print(i + "\t");
			if ((i+befordays) % 7 == 0) {//ÿ7������
				System.out.println();
			}
		}
	}
}
