
public class Person implements Comparable<Person> {
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

	// sort方法的排序依据就是根据这个compareTo方法的返回值来确定
	// 返回值有3中可能，正数，负数，0
	@Override
	public int compareTo(Person o) {

		// 如何决定这里的返回值是正数，负数，或者0呢，就需要我们通过代码来实现逻辑
		int res = name.length() - o.getName().length();
		if (res == 0) {
			return name.compareTo(o.getName());// 这里的compareTo是属于String和Person的没关系
			// 当前对象的属性放在前，升序，放在后降序
		}
		return res;// 只有2种可能，正数或负数
	}

}
