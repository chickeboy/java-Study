package hk2;

public class Teacher {
	private int id;
	private String name;
	private String sex;
	private int score;
	public Teacher(int id, String name, String sex, int score) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex + ", score=" + score + "]";
	}
	
}
