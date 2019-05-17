package tk2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �˵�ģʽ
 */
public class Tk1 {
	public static Scanner scanner = new Scanner(System.in);
	public static String choice;// �û�ѡ�����
	public static String[] array = new String[5];// ���ѧ����������
	public static int size = 0;// ������ʵ��Ԫ�صĸ���

	// ȫ�ֱ����������������еķ���������ʹ��ͬһ��scanner
	public static void main(String[] args) {
		mainMenu();
	}

	// ���˵�
	public static void mainMenu() {
		while (true) {
			System.out.println("========ѧ������ϵͳ========");
			System.out.println("1.��¼");
			System.out.println("2.�˳�");
			choice = scanner.next();
			switch (choice) {
			case "1":
				loginMenu();
				break;
			case "2":
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	// ��¼����
	public static void loginMenu() {
		int count = 0;
		while (true) {
			System.out.println("�˺�");
			String name = scanner.next();
			System.out.println("����");
			String passWord = scanner.next();
			if (name.equals("admin") && passWord.equals("111")) {
				System.out.println("��¼�ɹ�");
				studentMainMenu();
				return;
			} else {
				count++;
				System.out.println("����ʣ��......" + (3 - count) + "�λ���");
				if (count == 3) {
					System.out.println("�Բ����ټ�");
					break;
				}
			}
		}
	}

	public static void studentMainMenu() {
		while (true) {
			System.out.println("=========ѧ���������=========");
			System.out.println("1.���ѧ��");
			System.out.println("2.ɾ��ѧ��");
			System.out.println("3.�鿴ѧ��");
			System.out.println("4.�޸�ѧ��");
			System.out.println("5.������һ��");
			choice = scanner.next();
			switch (choice) {
			case "1":
				addMenu();
				break;
			case "2":
				break;
			case "3":
				searchAllMenu();
				break;
			case "4":
				break;
			case "5":
				return;
			default:
				break;
			}
		}
	}

	public static void searchAllMenu() {
		searchArray("����ѧԱ��Ϣ");
	}

	public static void searchArray(String str) {
		System.out.println("===========" + str + "===========");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	// ���ѧ����Ϣ�˵�
	public static void addMenu() {
		while (true) {
			System.out.println("����");
			String name = scanner.next();
			if (add(name)) {
				System.out.println("��ӳɹ�");
			} else {
				System.out.println("���ʧ��");
			}
			if (!isGoOn()) {
				break;
			}
		}
	}

	// �Ƿ���� ����ֵλfalse��ʾ������
	public static boolean isGoOn() {
		System.out.println("�����Ƿ����");
		choice = scanner.next();
		if (choice.equals("n")) {
			return false;
		}
		return true;
	}

	// ���ѧ���߼� �ظ��������
	public static boolean add(String name) {
		bigger();// ���ж������Ƿ񹻴�
		if (indexOf(name) == -1) {// û���ҵ��ظ���
			array[size++] = name;// β��
			return true;
		}
		return false;
	}

	public static void bigger() {
		if (size == array.length) {
			array = Arrays.copyOf(array, size * 2 + 1);
		}
	}

	public static int indexOf(String name) {
		int index = -1;
		for (int i = 0; i < size; i++) {// ƥ��ʵ�ʸ�����Ԫ��
			if (name.equals(array[i])) {
				index = i;
				break;
			}
		}
		return index;
	}
}
