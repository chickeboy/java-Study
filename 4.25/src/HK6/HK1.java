package HK6;
/*6.��д���׵�ѧ������ϵͳ���������Ҫ��:
(6)ѧ���ࣺid,name,gender,age,score
(7)�˵���
��ע��
�ڵ�¼
�����ѧԱ
��ɾ��ѧԱ
���޸�ѧԱ���޸�ĳһ�����Լ��ɣ�
�޲鿴ѧԱ��Ϣ(��Ҫ��Ҫ����nullֵ)*/

import java.util.Scanner;

public class HK1 {
	private static Scanner scanner = new Scanner(System.in);
	private static Root root = new Root();
	private static Manager manager = new Manager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {//��½ע�����
			System.out.println("��ӭʹ��ѧ����Ϣ����ϵͳ������");
			System.out.println("1.��½");
			System.out.println("2.ע��");
			System.out.println("3.�˳�");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				login();//��½����
				break;
			case 2:
				registered();//ע�����
			case 3:
				return;//��������
			default:
				break;
			}
		}

	}

	public static void registered() {//ע�����
		System.out.println("===========ע�����===========");
		System.out.println("�������û�����");
		String username = scanner.next();
		System.out.println("���������룺");
		String password = scanner.next();
		Userinformation userinformation = new Userinformation(username, password);//�������username��password����Userinformation��
		if (root.addroot(userinformation)) {//����true˵��ע��ɹ�����main��������
			System.out.println("ע��ɹ�");
			main();
		} else {
			System.out.println("ע��ʧ��");//����false����ע��
		}
	}

	public static void login() {//��½����
		System.out.println("===========��½����===========");
		System.out.println("�������û�����");
		String username = scanner.next();
		System.out.println("���������룺");
		String password = scanner.next();
		if (root.find(username, password)) {//����find����
			System.out.println("��½�ɹ�");//����true˵��ע��ɹ�����main��������
			main();
		} else {
			System.out.println("��½ʧ��");//����false���ܵ�½
		}
	}
//�����ճ���   ע���ҾͲ�д��
	public static void main() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("=======ѧ������ϵͳ=========");
			System.out.println("1.���ѧ��");
			System.out.println("2.ɾ��ѧ��");
			System.out.println("3.�޸�ѧ��");
			System.out.println("4.�鿴ѧ��");
			System.out.println("5.�˳�");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				addMenu();
				break;
			case 2:
				removeByIdMenu();
				break;
			case 3:
				updateMenu();
				break;
			case 4:
				searchAllMenu();
				break;
			case 5:
				return;
			default:
				break;
			}
		}
	}

	public static void searchAllMenu() {
		// TODO Auto-generated method stub
		Student[] stus = manager.getAll();
		Util.show(stus, "����ѧ����Ϣ");
	}

	public static void updateMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("������Ҫ�޸ĵ�ѧ��id");
			int id = scanner.nextInt();
			System.out.println("������Ҫ�޸ĵ�name");
			String name = scanner.next();
			Student student = new Student(id, name);
			if (manager.update(id, student)) {
				System.out.println("�޸ĳɹ�");
			} else {
				System.out.println("�޸�ʧ��");
			}
			if (!Util.isGoOn()) {
				break;
			}
		}
	}

	public static void removeByIdMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("������Ҫɾ����id");
			int id = scanner.nextInt();
			if (manager.remove(id)) {
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("ɾ��ʧ��");
			}
			if (!Util.isGoOn()) {
				break;
			}
		}
	}

	public static void addMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("gender");
			int gender = scanner.nextInt();
			System.out.println("age");
			int age = scanner.nextInt();
			System.out.println("score");
			int score = scanner.nextInt();
			Student student = new Student(id, name, gender, age, score);
			if (manager.save(student)) {
				System.out.println("��ӳɹ�");
			} else {
				System.out.println("���ʧ��");
			}
			if (!Util.isGoOn()) {
				break;
			}
		}
	}

}
