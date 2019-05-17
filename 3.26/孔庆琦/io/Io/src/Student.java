import java.io.Serializable;

// Student一定要序列化
public class Student implements Comparable<Student>, Serializable {
	private int age;
	private int id;
	private String name;

	public Student(int age, int id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return id - o.getId();
	}

}
