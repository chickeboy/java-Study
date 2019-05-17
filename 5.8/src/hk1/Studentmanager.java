package hk1;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Studentmanager {
	private List<Student> arrayList;

	public Studentmanager(List<Student> arrayList) {
		super();
		this.arrayList = arrayList;
	}

	public void add() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			Student student = new Student(id, name, age);
			arrayList.add(student);
			System.out.println("存入成功");
			System.out.println("是否继续y/n");
			String str = scanner.next();
			if (str.equals("n")) {
				break;
			}
		}
	}
	public void remove() {
		try {
			arrayList.remove(arrayList.indexOf(new Student(10)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("不存在的值");
		}
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
	}
	public boolean find() {
		return arrayList.contains(new Student("李四"));
	}
	public boolean findbyname() {
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getName().equals("王五")&&student.getAge()==32) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	public int findbyall() {
		int index = arrayList.indexOf(new Student(4, "王五",32));
		try {
			Student student = arrayList.get(index);
			student.setAge(55);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("不存在的数据");
		}
		return index;
	}
	public void show() {
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
	}
	public void showbyage() {
		for (Iterator<Student> iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getAge()==4) {
				System.out.println(student);
			}
		}
	}
}
