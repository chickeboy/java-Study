package tk;

import java.util.Scanner;

/*
 * �ж�һ�����Ƿ�Ϊż����
 */
public class Tk3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		String str = "����";
		if (num % 2 == 0) {
			str = "��";
		}
		//str��%2!=0����ԭ��ֵ"����"
		System.out.println(num + str + "ż��");
	}
}
