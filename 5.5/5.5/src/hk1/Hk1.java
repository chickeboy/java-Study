package hk1;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 1.要求如下：
1）Person类自身具备比较能力（实现Comparable<T>接口），
比较的规则是“按照姓名长度升序排序，如果长度相同，
则按照姓名字典顺序排序”（请用英文名）。
2）然后通过匿名内部类指定一种比较器（Comparator<T>），比较规则是“分数降序”。
3）写一个测试类，创建ArrayList<Person>集合，并添加5个Person对象。
分别用上述两种比较规则对该集合排序，检验排序结果。

 */
public class Hk1 {
	public static void main(String[] args) {
		Person[] array = new Person[4];
		array[0] = new Person("fff", 100);
		array[1] = new Person("xxx", 32);
		array[2] = new Person("fz", 42);
		array[3] = new Person("za", 55);
		Arrays.sort(array);
		for (Person person : array) {
			System.out.println(person);
		}
		System.out.println("==================");
		Arrays.sort(array, new CompareByScore());
		for (Person person : array) {
			System.out.println(person);
		}

	}
}

class CompareByScore implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return Double.compare(o2.getScore(), o1.getScore());
	}

}

//comparable就是让类本身具有可比性
class Person implements Comparable<Person> {
	private String name;
	private double score;

	public Person(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Person o) {
		int res = name.length() - o.getName().length();
		if (res == 0) {
			return name.compareTo(o.getName());
		}
		return res;
	}
}
