import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("张三", 10));
		arrayList.add(new Student("李四", 14));
		arrayList.add(new Student("王五", 26));
		arrayList.add(new Student("小明", 18));
		arrayList.add(new Student("小王", 20));
		Student student1 = new Student("张三", 10);
		System.out.println(arrayList.indexOf(student1));
		for (Student student : arrayList) {
			System.out.println(student);
		}
	}

}
class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}