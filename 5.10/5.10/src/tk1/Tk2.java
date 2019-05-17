package tk1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/*
 * 创建Student 类 具有属性id name score
 *1.创建HashSet存放5条数据，判重依据是id
 *2.使用TreeSet对数据进行排序，排序依据是id
 *3.使用TreeSet继续排序，排序依据是name;
 *4.使用TreeSet继续排序，排序依据是name相同比较score(相同的保留)
 *Collections.sort Collections它只是用来辅助List接口下所有实现类
 *容器，List本身没有排序功能，通过Collections.sort这个方法
 *会对List中存数据进行排序 是对已有数据进行排序 先存 再排
 *TreeSet  容器本身就具有排序功能，不需要借助工具类型但是需要
 *比较规则  先确定排序规则，然后存入的数据根据这种规则排序
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
		// 通过匿名内部类传入比较器的对象
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
