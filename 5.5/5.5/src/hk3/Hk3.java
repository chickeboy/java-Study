package hk3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 有一个学生类，具有属性id  name  age  score
要求创建一个数组循环输入学生对象
学生本身带有排序规则 根据ID排序
再创建2个比较器 分别根据 年龄 或者 成绩排序
最后创建一个比较器,比较规则：先比名字，名字相比年龄，年龄相同比成绩。
分别调用输出。
 */
public class Hk3 {
	public static void main(String[] args) {
		Student[] array = new Student[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			System.out.println("score");
			double score = scanner.nextDouble();
			Student student = new Student(id, name, age, score);
			array[i] = student;
		}
		Arrays.sort(array);
		Util util = new Util();
		util.show(array);
		Arrays.sort(array, new CompareByAge());
		util.show(array);
		Arrays.sort(array,new CompareByScore());
		util.show(array);
		Arrays.sort(array,new CompareByAll());
		util.show(array);
	}
}

class Util {
	public void show(Student[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("===================");
	}
}

class CompareByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

}

class CompareByScore implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getScore(), o2.getScore());
	}
}

class CompareByAll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int res = o1.getName().compareTo(o2.getName());
		if (res == 0) {
			res = o1.getAge() - o2.getAge();
			if (res == 0) {
				return Double.compare(o1.getScore(), o2.getScore());
			}
			return res;
		}
		return res;
	}

}

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private double score;

	public Student(int id, String name, int age, double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return id - o.getId();
	}

}
