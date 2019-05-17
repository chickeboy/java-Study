package tk;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	private Scanner scanner;
	private List<Student> arrayList;
	
	public StudentManager(List<Student> arrayList) {
		super();
		this.arrayList = arrayList;
	}

	public void add() {
		scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			System.out.println("score");
			int score = scanner.nextInt();
			Student student = new Student(id, name, age, score);
			if (arrayList.indexOf(student) != -1) {
				System.out.println("�������Ѿ�����");
			} else {
				arrayList.add(student);
				System.out.println("����ɹ�");
			}
			System.out.println("�Ƿ����y/n");
			String string = scanner.next();
			if (string.equals("n")) {
				break;
			}
		}
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}

	}

	public void find() {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ��ѧ��id");
		int findbyid = scanner.nextInt();
		int index = arrayList.indexOf(new Student(findbyid));
		if (index!=-1) {
			System.out.println(arrayList.get(index));
		}else {
			System.out.println("δ�ҵ�����");
		}
	}
	public void findbyname() {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		String string = scanner.next();
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getName().equals(string)) {
				System.out.println(student);
			}
		}
	}
	public void findbyage() {
		// TODO Auto-generated method stub
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getAge()>15) {
				System.out.println(student);
			}
		}
	}
	public void removebyid() {
		scanner = new Scanner(System.in);
		System.out.println("������Ҫɾ����id");
		int id = scanner.nextInt();
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getId()==id) {
				iterator.remove();
			}
		}
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
	}
	public void removesclect() {
		scanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		String string = scanner.next();
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getName().equals(string)) {
				System.out.println(student);
			}
		}
		System.out.println("������Ҫɾ����id");
		int id = scanner.nextInt();
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getId()==id) {
				iterator.remove();
			}
		}
		
	}
	public void compater() {
		Collections.sort(arrayList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				
				return o1.getScoe()-o2.getScoe();
			}
		} );
	}
}
