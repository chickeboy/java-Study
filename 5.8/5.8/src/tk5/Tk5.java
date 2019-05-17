package tk5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ����һ��Student��,id  name  age  score
����һ��StudentManager�� �ṩ��ѧ������ĸ��ַ���
���д���·���
1.�ֶ���ѧ�����ݽ���¼�룬id�ظ������ݲ������
2.�����������ѧ����Ϣ
3.����һ��id��ȡ��ѧ����������Ϣ
4.����һ��name��ȡ���ж�Ӧѧ������Ϣ
5.��ȡ�������䳬��15��ѧԱ��Ϣ
6.����һ��idɾ����ѧ����Ϣ
7.����һ��name���ȴ�ӡ����name��Ӧ��ѧ����Ϣ��Ȼ����ѡ��ɾ�������ĸ�ѧ����Ϣ
8.ʹ�������ڲ���Լ��ϸ���score��������
 */
public class Tk5 {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.add();
		manager.show();
		manager.findById();
		manager.findByName();
		manager.removeById();
		manager.show();
		manager.removeByName();

	}
}

class Manager {
	private ArrayList<Student> al;
	private Scanner scanner;
	private Util util;

	public Manager() {
		al = new ArrayList<>();
		scanner = new Scanner(System.in);
		util = new Util();
	}

	public void add() {
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			System.out.println("score");
			double score = scanner.nextDouble();
			Student student = new Student(id, name, age, score);
			// 1.contains������
			if (al.contains(student)) {
				System.out.println("�ظ�����");
			} else {
				al.add(student);
				System.out.println("��ӳɹ�");
			}
			System.out.println("�����Ƿ����");
			String choice = scanner.next();
			if (choice.equals("n")) {
				break;
			}
		}
	}

	public void show() {
		util.show(al);
	}

	public void findByName() {
		System.out.println("������һ��name");
		String name = scanner.next();
		ArrayList<Student> a = new ArrayList<Student>();
		// ��ŷ���Ҫ���ѧ����Ϣ
		for (int i = 0; i < al.size(); i++) {
			if (name.equals(al.get(i).getName())) {
				a.add(al.get(i));
			}
		}
		if (a.isEmpty()) {// �жϼ������Ƿ���Ԫ��
			System.out.println("������");
		} else {
			util.show(a);
		}
	}

	public void removeByName() {
		System.out.println("������name");
		String name = scanner.next();
		ArrayList<Student> a = new ArrayList<Student>();
		for (int i = 0; i < al.size(); i++) {
			if (name.equals(al.get(i).getName())) {
				a.add(al.get(i));
			}
		}
		if (a.isEmpty()) {
			System.out.println("������");
		} else {
			util.show(a);// �����˿�һ���м�����������ֵ���
			System.out.println("����Ҫɾ������id�Ƕ���");
			int id = scanner.nextInt();
			// idȥ����Щ�˵�id����ƥ�䣬һ��Ҫ����Щ���еĲ���ɾ��
			// aҲ��һ��Student���͵ļ��ϣ���ôҲ������student
			// ��equals���߼�
			Student student = new Student(id);
			if (a.contains(student)) {
				al.remove(student);// ԭ���� ����Դ
			} else {
				System.out.println("��������");
			}
			util.show(al);
		}
	}

	public void removeById() {
		System.out.println("������һ��id");
		int id = scanner.nextInt();
		Student student = new Student(id);
		if (al.remove(student)) {
			System.out.println("ɾ���ɹ�");
		} else {
			System.out.println("ɾ��ʧ��");
		}
//		int index = al.indexOf(student);
//		if (index == -1) {
//			System.out.println("û��");
//		} else {
//			al.remove(index);
//			System.out.println("ɾ���ɹ�");
//		}
	}

	public void findById() {
		System.out.println("������һ��id");
		int id = scanner.nextInt();
		int index = al.indexOf(new Student(id));
		// indexOf���Ǹ���equals�������߼�
		// equals��д����id��ô�ҵ�ʱ��͸���idȥ�ж��Ƿ���ͬһ������
		// ���������������������û�����ã�ͨ�����췽��������
		// ʹ��һ��id�Ϳ��Դ���һ������
		if (index == -1) {
			System.out.println("û��");
		} else {
			System.out.println(al.get(index));
		}
//		Student student = null;
//		for (int i = 0; i < al.size(); i++) {
//			if (al.get(i).getId() == id) {
//				student = al.get(i);
//				break;
//			}
//		}
//		if (student == null) {
//			System.out.println("������");
//		} else {
//			System.out.println(student);
//		}
	}

}

class Util {
	public <T> void show(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
	}
}

class Student {
	private int id;
	private String name;
	private int age;
	private double score;

	public Student(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Student(int id, String name, int age, double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

}
