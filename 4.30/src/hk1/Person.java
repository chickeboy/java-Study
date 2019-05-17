package hk1;

public class Person implements Comparable<Person> {
	private String name;
	private int score;

	public Person(String name, int score) {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Person person) {
		int length1 = this.getName().length();
		int length2 = person.getName().length();
		int min = Math.min(length1, length2);
		if (length1 > length2) {
			return 1;
		}
		if (length1 < length2) {
			return -1;
		}
		for (int i = 0; i < min; i++) {
			if (this.getName().charAt(i) > person.getName().charAt(i)) {
				return 1;
			}
			if (this.getName().charAt(i) < person.getName().charAt(i)) {
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", score=" + score + "]";
	}
	
}
