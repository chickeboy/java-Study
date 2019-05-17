package tk1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/*
 * ����Student �� ��������id name score
 *1.����HashSet���5�����ݣ�����������id
 *2.ʹ��TreeSet�����ݽ�����������������id
 *3.ʹ��TreeSet������������������name;
 *4.ʹ��TreeSet������������������name��ͬ�Ƚ�score(��ͬ�ı���)
 *Collections.sort Collections��ֻ����������List�ӿ�������ʵ����
 *������List����û�������ܣ�ͨ��Collections.sort�������
 *���List�д����ݽ������� �Ƕ��������ݽ������� �ȴ� ����
 *TreeSet  ��������;��������ܣ�����Ҫ�����������͵�����Ҫ
 *�ȽϹ���  ��ȷ���������Ȼ���������ݸ������ֹ�������
 */
public class Tk2 {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(3, "ff", 99));
		hs.add(new Student(2, "xx", 97));
		hs.add(new Student(1, "zz", 98));
		hs.add(new Student(5, "xx", 98));
		hs.add(new Student(5, "ff", 96));
		for (Student student : hs) {
			System.out.println(student);
		}
		System.out.println("=================");
		TreeSet<Student> ts = new TreeSet<Student>(hs);
		for (Student student : ts) {
			System.out.println(student);
		}
		System.out.println("=================");
		// ͨ�������ڲ��ഫ��Ƚ����Ķ���
		ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		ts.addAll(hs);
		for (Student student : ts) {
			System.out.println(student);
		}
		ts = new TreeSet<Student>(new CompareByNameScore());
		ts.addAll(hs);
		System.out.println("==============");
		for (Student student : ts) {
			System.out.println(student);
		}
	}
}

class CompareByNameScore implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getName().equals(o2.getName())) {
			int res = Double.compare(o1.getScore(), o2.getScore());
			return res == 0 ? 1 : res;
		}
		return o1.getName().compareTo(o2.getName());
	}

}

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double score;

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

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int compareTo(Student o) {
		return id - o.getId();
	}

}
