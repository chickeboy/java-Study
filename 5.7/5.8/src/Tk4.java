package tk4;

import java.util.ArrayList;
import java.util.Scanner;

public class Tk4 {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.add();
		manager.show();
	}
}

class StudentManager {
	private ArrayList<Student> al;
	private Scanner scanner;

	public StudentManager() {
		al = new ArrayList<Student>();
		scanner = new Scanner(System.in);
	}

	public void show() {
		for (Student student : al) {
			System.out.println(student);
		}
	}

	public void add() {
		int count = 0;
		while (count < 4) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("score");
			double score = scanner.nextDouble();
			Student student = new Student(id, name, score);
			if (al.contains(student)) {
				System.out.println("该id学生已经存在");
			} else {
				al.add(student);
				System.out.println("添加成功");
			}
			count++;
		}
	}
}

class Student {
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

}
