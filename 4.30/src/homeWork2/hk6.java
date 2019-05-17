package homeWork2;

import java.util.Arrays;

public class hk6 {
	/*
	 * 编写一个程序，要求： 1) 定义一个Student类（属性：学号、名字、成绩），通过实现comparable接口让它具有比较大小的能力（通过成绩来比较）
	 * 2)定义一个Student数组stus，生成5个Student对象，存入stus中
	 * 3)定义一个StudentTest类，通过调用Arrays工具类中的sort方法来对stus中的元素进行排序。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu[] = new Student[5];
		stu[0] = new Student(1, "aa", 80);
		stu[1] = new Student(3, "ac", 67);
		stu[2] = new Student(2, "ca", 74);
		stu[3] = new Student(5, "aac", 97);
		stu[4] = new Student(4, "baa", 88);
		Arrays.sort(stu);
		for (Student student : stu) {
			System.out.println(student);
		}
	}

}
class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int score;

	public Student(int id, String name, int score) {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return score-o.score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
}