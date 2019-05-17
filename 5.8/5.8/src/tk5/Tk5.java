package tk5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 创建一个Student类,id  name  age  score
创建一个StudentManager类 提供对学生管理的各种方法
请编写以下方法
1.手动对学生数据进行录入，id重复的数据不能添加
2.遍历输出所有学生信息
3.输入一个id获取该学生的完整信息
4.输入一个name获取所有对应学生的信息
5.获取所有年龄超过15的学员信息
6.输入一个id删除该学生信息
7.输入一个name，先打印出该name对应的学生信息，然后再选择删除具体哪个学生信息
8.使用匿名内部类对集合根据score降序排序
 */
public class Tk5 {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.add();
		manager.show();
		manager.findById();
		manager.findByName();
		manager.removeById();
		manager.show();
		manager.removeByName();

	}
}

class Manager {
	private ArrayList<Student> al;
	private Scanner scanner;
	private Util util;

	public Manager() {
		al = new ArrayList<>();
		scanner = new Scanner(System.in);
		util = new Util();
	}

	public void add() {
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			System.out.println("score");
			double score = scanner.nextDouble();
			Student student = new Student(id, name, age, score);
			// 1.contains的依据
			if (al.contains(student)) {
				System.out.println("重复数据");
			} else {
				al.add(student);
				System.out.println("添加成功");
			}
			System.out.println("请问是否继续");
			String choice = scanner.next();
			if (choice.equals("n")) {
				break;
			}
		}
	}

	public void show() {
		util.show(al);
	}

	public void findByName() {
		System.out.println("请输入一个name");
		String name = scanner.next();
		ArrayList<Student> a = new ArrayList<Student>();
		// 存放符合要求的学生信息
		for (int i = 0; i < al.size(); i++) {
			if (name.equals(al.get(i).getName())) {
				a.add(al.get(i));
			}
		}
		if (a.isEmpty()) {// 判断集合中是否有元素
			System.out.println("不存在");
		} else {
			util.show(a);
		}
	}

	public void removeByName() {
		System.out.println("请输入name");
		String name = scanner.next();
		ArrayList<Student> a = new ArrayList<Student>();
		for (int i = 0; i < al.size(); i++) {
			if (name.equals(al.get(i).getName())) {
				a.add(al.get(i));
			}
		}
		if (a.isEmpty()) {
			System.out.println("不存在");
		} else {
			util.show(a);// 给别人看一下有几个叫这个名字的人
			System.out.println("请问要删除的人id是多少");
			int id = scanner.nextInt();
			// id去和这些人的id进行匹配，一定要是这些人有的才能删除
			// a也是一个Student类型的集合，那么也可以用student
			// 的equals的逻辑
			Student student = new Student(id);
			if (a.contains(student)) {
				al.remove(student);// 原集合 集合源
			} else {
				System.out.println("输入有误");
			}
			util.show(al);
		}
	}

	public void removeById() {
		System.out.println("请输入一个id");
		int id = scanner.nextInt();
		Student student = new Student(id);
		if (al.remove(student)) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
//		int index = al.indexOf(student);
//		if (index == -1) {
//			System.out.println("没有");
//		} else {
//			al.remove(index);
//			System.out.println("删除成功");
//		}
	}

	public void findById() {
		System.out.println("请输入一个id");
		int id = scanner.nextInt();
		int index = al.indexOf(new Student(id));
		// indexOf就是根据equals方法的逻辑
		// equals重写的是id那么找的时候就根据id去判断是否是同一个对象
		// 其他的属性在这个操作上没有作用，通过构造方法的重载
		// 使用一个id就可以创建一个对象
		if (index == -1) {
			System.out.println("没有");
		} else {
			System.out.println(al.get(index));
		}
//		Student student = null;
//		for (int i = 0; i < al.size(); i++) {
//			if (al.get(i).getId() == id) {
//				student = al.get(i);
//				break;
//			}
//		}
//		if (student == null) {
//			System.out.println("不存在");
//		} else {
//			System.out.println(student);
//		}
	}

}

class Util {
	public <T> void show(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
	}
}

class Student {
	private int id;
	private String name;
	private int age;
	private double score;

	public Student(int id) {
		super();
		this.id = id;
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

}
