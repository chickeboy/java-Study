package HK6;
	
public class Student {
	int id ;
	String name;
	int gender;
	int age;
	int score;
	public Student(int id, String name, int gender, int age, int score) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.score = score;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
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
	
}
