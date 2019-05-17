
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

	// sort�������������ݾ��Ǹ������compareTo�����ķ���ֵ��ȷ��
	// ����ֵ��3�п��ܣ�������������0
	@Override
	public int compareTo(Person o) {

		// ��ξ�������ķ���ֵ������������������0�أ�����Ҫ����ͨ��������ʵ���߼�
		int res = name.length() - o.getName().length();
		if (res == 0) {
			return name.compareTo(o.getName());// �����compareTo������String��Person��û��ϵ
			// ��ǰ��������Է���ǰ�����򣬷��ں���
		}
		return res;// ֻ��2�ֿ��ܣ���������
	}

}
