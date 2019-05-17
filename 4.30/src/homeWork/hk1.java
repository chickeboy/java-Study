package homeWork;

import java.util.Arrays;
import java.util.Comparator;

/*1.Ҫ�����£�
1��Person������߱��Ƚ�������ʵ��Comparable<T>�ӿڣ����ȽϵĹ����ǡ������������������������������ͬ�����������ֵ�˳�����򡱣�����Ӣ��������
2��Ȼ��ͨ�������ڲ���ָ��һ�ֱȽ�����Comparator<T>�����ȽϹ����ǡ��������򡱡�
3��дһ�������࣬����ArrayList<Person>���ϣ������5��Person���󡣷ֱ����������ֱȽϹ���Ըü������򣬼�����������
���ߴ����ϴ��������Ƴ����÷�ֵ*/
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
