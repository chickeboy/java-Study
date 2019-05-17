package homeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*有一个学生类，具有属性id  name  age  score
要求创建一个数组循环输入学生对象
学生本身带有排序规则 根据ID排序
再创建2个比较器 分别根据 年龄 或者 成绩排序
最后创建一个比较器,比较规则：先比名字，名字相比年龄，年龄相同比成绩。
分别调用输出。
在线答题上传答案上移下移移除设置分值*/
public class hk3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student array[] = new Student[4];
		array[0] = new Student(1, "aa", 13, 67);
		array[1] = new Student(3, "ccb", 16, 89);
		array[2] = new Student(2, "ca", 21, 56);
		array[3] = new Student(4, "abc", 33, 100);
		/*
		 * for (int i = 0; i < array.length; i++) { System.out.println("请输入id"); int id
		 * = scanner.nextInt(); System.out.println("请输入姓名"); String name =
		 * scanner.next(); System.out.println("请输入年龄"); int age = scanner.nextInt();
		 * System.out.println("请输入分数"); int score = scanner.nextInt(); array[i] = new
		 * Student(id, name, age, score); System.out.println("=================="); }
		 */
		Arrays.sort(array);
		for (Student student : array) {
			System.out.println(student);
		}
		System.out.println("================");

		CompareByname compareByname = new CompareByname();
		Arrays.sort(array, compareByname);
		for (Student student : array) {
			System.out.println(student);
		}

		System.out.println("================");
		CompareByscore1 compareByScore = new CompareByscore1();
		Arrays.sort(array, compareByScore);
		for (Student student : array) {
			System.out.println(student);
		}

		System.out.println("================");
		Compare compare = new Compare();
		Arrays.sort(array, compare);
		for (Student student : array) {
			System.out.println(student);
		}
	}

}

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private int score;

	public Student(int id, String name, int age, int score) {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
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

class CompareByname implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}
}

class CompareByscore1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getScore() - o2.getScore();
	}

}
class Compare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getName().compareTo(o2.getName())!=0) {
			return o1.getName().compareTo(o2.getName());
		}else if(o1.getAge()!=o2.getAge()){
			return o1.getAge()-o2.getAge();
		}else {
			return o1.getScore()-o2.getScore();
		}
	}
}
