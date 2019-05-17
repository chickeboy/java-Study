package tk4;

import java.util.Arrays;
import java.util.Comparator;

/*
 * �����Ƿ�����Ŀ����Ҫ���Ƕ�����������
 * ��ô���Ǿ�ʹ�õ�Comparator�ӿ�
 */
public class Tk5 {
	public static void main(String[] args) {
		Student[] stus = new Student[4];
		stus[0] = new Student(3, "ff");
		stus[1] = new Student(4, "xx");
		stus[2] = new Student(2, "zz");
		stus[3] = new Student(1, "fff");
		Arrays.sort(stus);
		for (Student student : stus) {
			System.out.println(student);
		}
		System.out.println("=============");
		// ����һ���Ƚ����Ķ���
		CompareByName byName = new CompareByName();
		Arrays.sort(stus, byName);
		// ֻ��ĳһ����ʱ������ʱ������student�������������
		for (Student student : stus) {
			System.out.println(student);
		}
		System.out.println("=============");
		Arrays.sort(stus);
		for (Student student : stus) {
			System.out.println(student);
		}
		Integer[] array = { 1, 2, 3, 4, 5 };
		Arrays.sort(array, new ComareByNum());
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}
}

class ComareByNum implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}

}

//дһ��Comparator��ʵ����
class CompareByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return id - o.getId();
	}

}
