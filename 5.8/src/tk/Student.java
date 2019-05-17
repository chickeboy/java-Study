package tk;

public class Student {
	private int id;
	private String name;
	private int age;
	private int scoe;
	public Student(int id, String name, int age, int scoe) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.scoe = scoe;
	}
	
	public Student(int id) {
		super();
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoe() {
		return scoe;
	}
	public void setScoe(int scoe) {
		this.scoe = scoe;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", scoe=" + scoe + "]";
	}
	
}
