package HomeWork3;

import java.io.Serializable;

public class Animal implements Comparable<Animal>,Serializable {
	private String name;
	private int age;
	private String sex;
	public Animal(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return age-o.getAge();
	}
	
}
