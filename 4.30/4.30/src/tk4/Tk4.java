package tk4;

import java.util.Arrays;

/*
 * �ֽ׶αȽ�ʵ�õ�ϵͳ�ӿ�
 * Comparable  �Ƚ���
 * Comparator
 */
public class Tk4 {
	public static void main(String[] args) {
//		int[] array = { 2, 1, 22, 44, 11, 4 };
//		Arrays.sort(array);
//		for (int i : array) {
//			System.out.println(i);
//		}
		Stu[] stus = new Stu[5];
		String str = "f";
		stus[0] = new Stu(3, "fx", 93);
		stus[1] = new Stu(3, "zz", 92);
		stus[2] = new Stu(3, "zz", 91);
		stus[3] = new Stu(2, "xx", 95);
		// stus[4] = null;
		Arrays.sort(stus);
		// Arrays.sort���Զ��κ������������
		// ������ǰ��Ҫ������������д�ŵĶ�������Ҫ�пɱ���
		// ֻҪ��������������ȥʵ��Comparable�ӿڣ�
		// ϵͳ����Ϊ���Ǿ��пɱ��Եģ���������������������
		// ������ȥ��������
		for (Stu stu : stus) {
			System.out.println(stu);
		}

	}
}
/*
 * ������������ֻ��һ�ֵ�ʱ��Comparable
 * ��Ϊ������ʵ���ࣨ������������ͣ�ȥʵ�ֵ�
 * compareTo�����ķ���ֵ�߼�ֻ����һ��
 */
class Stu implements Comparable<Stu> {
	private int id;
	private String name;
	private double score;

	public Stu(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Stu o) {
		// 1.�ȱȽ�id�ٱȽ��������Ƚϳɼ�
		if (id == o.getId()) {
			if (name.compareTo(o.getName()) == 0) {
				return Double.compare(score, o.getScore());
			}
			return name.compareTo(o.getName());
		}
		return id - o.getId();// ���ﲻ�����0�����

//		if (score > o.getScore()) {
//			return 1;
//		} else if (score < o.getScore()) {
//			return -1;
//		} else {
//			return 0;
//		}
//		return -Double.compare(score, o.getScore());
		// return id - o.getId();
//		return name.compareTo(o.getName());
		// ��������ǰ����� ����(��ǰ����С) 0����ȣ�
	}

}
