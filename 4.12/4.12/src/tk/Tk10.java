package tk;

import java.util.Scanner;

/*
 * 9.�Ӽ��������˺����룬ȫ��������������˺Ŵ��󣬶�������ʾ
ֱ��������ȷΪֹ
 */
public class Tk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("�˺�");
			String name = scanner.next();
			System.out.println("����");
			String passWord = scanner.next();
			if (name.equals("aa") && passWord.equals("1")) {
				System.out.println("��ȷ");
				break;
			} else if (name.equals("aa")) {// ������һ���Ǵ��
				System.out.println("�������");
			} else if (passWord.equals("1")) {
				System.out.println("�˺Ŵ���");
			} else {
				System.out.println("ȫ��");
			}
		}
	}
}
