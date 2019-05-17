package hk3;

import java.util.ArrayList;

/*
 * 集合中存放自定义类型
 */
public class Hk3 {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		// 存放自定义类型对象的时候集合的一些方法逻辑还是否有效
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
		 * List中出现的用对象作为参数操作集合内部的方法 这些方法的比较依据就是你存入集合对象类型的equals方法
		 * 的比较规则，如果自定义类型不重写equals，那么 默认调用Object类的equals方法，判断的依据就是
		 * 存入对象的地址是否相同，我们需要改变这个比较依据 就需要重写equals 自己根据需要判重的属性重写equals，系统的这些方法就会根据你需要判重的
		 * 属性去进行操作，但是注意，这个equals的判重依据只能有一种
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