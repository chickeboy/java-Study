package homeWork;

import java.util.Arrays;
import java.util.Comparator;

/*1.要求如下：
1）Person类自身具备比较能力（实现Comparable<T>接口），比较的规则是“按照姓名长度升序排序，如果长度相同，则按照姓名字典顺序排序”（请用英文名）。
2）然后通过匿名内部类指定一种比较器（Comparator<T>），比较规则是“分数降序”。
3）写一个测试类，创建ArrayList<Person>集合，并添加5个Person对象。分别用上述两种比较规则对该集合排序，检验排序结果。
在线答题上传答案下移移除设置分值*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] array = new Person[5];
		array[0] = new Person("aa", 90);
		array[1] = new Person("ac", 98);
		array[2] = new Person("cc", 67);
		array[3] = new Person("abb", 88);
		array[4] = new Person("caa", 100);
		Arrays.sort(array);
		for (Person person : array) {
			System.out.println(person);
		}
		System.out.println("=================");
		CompareByScore compareByScore = new CompareByScore();
		Arrays.sort(array, compareByScore);
		for (Person person : array) {
			System.out.println(person);
		}

	}

}

class Person implements Comparable<Person> {
	private String name;
	private int score;

	public Person(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub

		if (name.length() > o.getName().length()) {
			return 1;
		} else if (name.length() < o.getName().length()) {
			return -1;
		} else {
			return name.compareTo(o.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", score=" + score + "]";
	}

	
}

class CompareByScore implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getScore() - o2.getScore();
	}
}
