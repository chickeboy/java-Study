package tk5;
/**
 * A B C F G H J 
 *   D
 * E void sort(D d)
 */
import java.util.Arrays;

public class Tk5 {
	public static void main(String[] args) {
		Student[] stus = new Student[4];
		stus[0] = new Student("FF", 3);
		stus[1] = new Student("XX", 2);
		stus[2] = new Student("ZZ", 1);
		stus[3] = new Student("EE", 4);
		Arrays.sort(stus);
		String str = "f";
		for (Student student : stus) {
			System.out.println(student);
		}
	}
}

//继承和实现可以并存
class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
}

class Student extends Person {
	private int id;

	public Student(String name, int id) {
		super(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString() + "," + id;
	}

	@Override
	public int compareTo(Person o) {
		if (o.getClass() == this.getClass()) {
			Student student = (Student) o;
			return getId() - student.getId();
		}
		return super.compareTo(o);
	}
}
