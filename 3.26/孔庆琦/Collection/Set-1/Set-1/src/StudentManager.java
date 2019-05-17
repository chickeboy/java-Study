import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * �ṩ�˶Դ�����ݵļ��ϲ����ķ���
 * ��֪��һ��ѧ���࣬�������� id,name,age
Ҫ��
1.����һ��HashSet�����������ѧ������
2.��дһ������ѭ��¼��������ݣ������ظ���
3.��дһ�������������ϲ������
4.��дһ����������id���������ʵ��Comparable�ӿڣ�
5.��дһ����������age�������(ʵ��Comparator�ӿ�)
6.������������в���

 */
public class StudentManager {
	private HashSet<Student> hs;

	public StudentManager() {
		hs = new HashSet<>();// ͨ��studentManager�Ķ���Ĵ������Լ��Ͻ��д���
	}

	public void init() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			Student student = new Student(name, id, age);// ����һ������
			// ����Ĭ��id�����ظ�
			// ������Ҫ��֪�ظ��Ĺ���
			if (hs.contains(student)) {// �Ƿ������ȫȡ���ڴ�������equals��hashcode����������
				System.out.println("�Ѿ���ӹ���");
			} else {
				hs.add(student);
				System.out.println("��ӳɹ�");
			}
			System.out.println("�����Ƿ�Ҫ����������n�˳�");
			String c = scanner.next();
			if (c.equals("n") || c.equals("N")) {
				break;
			}
		}
	}

	public void showAll() {
		for (Student student : hs) {
			System.out.println(student);
		}
	}

	// ͨ��comapreable�ӿ��������
	public void sortById() {
		TreeSet<Student> ts = new TreeSet<>(hs);// ������췽�����Խ��������ϵ����ݸ��Ƶ�ts��
		// ts�������Ǿ��������ܣ�������һ��Ҫ��������������������
		for (Student student : ts) {
			System.out.println(student);
		}
	}

	public void sortByAge() {
		// ts������Ҫ�ȴ��ȽϹ����ٴ����ݽ�ȥ��
		TreeSet<Student> ts = new TreeSet<>(new CompareByAge());
		ts.addAll(hs);
		for (Student student : ts) {
			System.out.println(student);
		}
	}
}
