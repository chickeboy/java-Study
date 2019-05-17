package hk3;

import java.util.ArrayList;

/*
 * �����д���Զ�������
 */
public class Hk3 {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		// ����Զ������Ͷ����ʱ�򼯺ϵ�һЩ�����߼����Ƿ���Ч
		al.add(new Student(2, "xx", 23));
		al.add(new Student(1, "ff", 12));
		al.add(new Student(4, "bb", 43));
		al.add(new Student(5, "zz", 77));
		Student student = new Student(2, "zzz", 12);
		al.get(5).setId(1000);
		System.out.println(al);
		System.out.println(al.contains(student));
		System.out.println(al.indexOf(student));
		System.out.println(al.remove(student));
		/*
		 * List�г��ֵ��ö�����Ϊ�������������ڲ��ķ��� ��Щ�����ıȽ����ݾ�������뼯�϶������͵�equals����
		 * �ıȽϹ�������Զ������Ͳ���дequals����ô Ĭ�ϵ���Object���equals�������жϵ����ݾ���
		 * �������ĵ�ַ�Ƿ���ͬ��������Ҫ�ı�����Ƚ����� ����Ҫ��дequals �Լ�������Ҫ���ص�������дequals��ϵͳ����Щ�����ͻ��������Ҫ���ص�
		 * ����ȥ���в���������ע�⣬���equals����������ֻ����һ��
		 */
	}
}

class Student {
	private int id;
	private String name;
	private double score;

	public Student(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

}