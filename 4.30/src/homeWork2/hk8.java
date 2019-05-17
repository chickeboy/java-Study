package homeWork2;

import java.util.Arrays;
import java.util.Comparator;

/*写一个学生类：具有属性 id name score 
要求实现compareable接口 完成以下排序功能，
首先根据姓名排序，英文字母的自然顺序即可，姓名相同，
根据id排序，如果id再相同，根据 score排序。
要求在test中创建长度为5的学生类型数组，进行排序测试。 
然后再创建3个类实现comparaotr接口，
分别根据id,name,score单独排序，并且调用测试排序结果。
在线答题上传答案上移下移移除设置分值*/
public class hk8 {
	public static void main(String[] args) {
		Student1 student[] = new Student1[5];
		student[0] =new Student1(1,"b",90);
		student[1] =new Student1(2, "a", 88);
		student[2] =new Student1(1, "a", 77);
		student[3] = new Student1(3, "c", 66);
		student[4] = new Student1(5, "f", 50);
		Arrays.sort(student);
		for (Student1 student1 : student) {
			System.out.println(student1);
		}
		System.out.println("=========================");
		CompareByid compareByid = new CompareByid();
		Arrays.sort(student,compareByid);
		for (Student1 student1 : student) {
			System.out.println(student1);
		}
		System.out.println("=========================");
		CompareByname1 compareByname1 = new CompareByname1();
		Arrays.sort(student,compareByname1);
		for (Student1 student1 : student) {
			System.out.println(student1);
		}
		System.out.println("=========================");
		CompareByscore1 compareByscore1 = new CompareByscore1();
		Arrays.sort(student,compareByscore1);
		for (Student1 student1 : student) {
			System.out.println(student1);
		}
	}
}
class Student1 implements Comparable<Student1>{
	private int id;
	private String name;
	private int score;
	
	public Student1(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		if (id-o.getId()!=0) {
			return id - o.getId();
		}else if(name.compareTo(o.getName())!=0) {
			return name.compareTo(o.getName());
		}else {
			return score-o.getScore();
		}	
	}  
}
class CompareByid implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}
class CompareByname1 implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class CompareByscore1 implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getScore() -o2.getScore();
	}
	
}