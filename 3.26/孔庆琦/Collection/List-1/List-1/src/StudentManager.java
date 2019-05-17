import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * �ṩ��Ӧ�Ĳ������ϵķ�������
 */
public class StudentManager {
	// ��֤����Դ��Ψһ��
	private ArrayList<Student> al;

	public StudentManager() {
		// �ڴ���StudentManager�����ͬʱҲҪȥΪ al���ٿռ�
		al = new ArrayList<>();
	}

	// ¼����������
	public void init() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			Student student = new Student(name, age);// ����һ���µ�ѧ������
			al.add(student);// �������
		}
	}

	// �����ȥ�أ�ָ����¼�������Ժ���ȥ�����жϲ��������Ǳ�¼����ж�
	public void remove() {
		ArrayList<Student> newAl = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			// ��д��equals�Ժ�Student�����ص����ݾͷ����˸ı�
			// Api ArrayList contains���� �жϼ������Ƿ����ĳһ������
			// �жϳ�ʼ�����Ǵ�Ŷ����������͵�equals��������
			if (!newAl.contains(al.get(i))) {// ������������²Ž������
				newAl.add(al.get(i));
			}
		}
		al = newAl;// ��ȥ�ع����¼��ϵ����ø�ֵ���ϵļ���
	}

	public void show() {
		for (Student student : al) {
			System.out.println(student);
		}
	}
}
