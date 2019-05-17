package tk3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * map�д���Զ�������
 * HashMap:�ײ�hashֵ ����Key�������ظ���
 */
public class Tk3 {
	public static void main(String[] args) {
		HashMap<Student, Score> hm = new HashMap<Student, Score>();
		// ��key�������ǵ��ô���key�������͵�equals��hashcode
		hm.put(new Student(10000, "����"), new Score(3, 4, 5));
		hm.put(new Student(41441, "����"), new Score(3, 4, 4));
		hm.put(new Student(23321, "����"), new Score(8, 2, 3));
		hm.put(new Student(54444, "����"), new Score(7, 3, 5));
		Set<Entry<Student, Score>> entrySet = hm.entrySet();
		for (Entry<Student, Score> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("=========================");
		// TreeMap�������򣬵���ֻ�Ƕ�key��������
		// �����keyһ��Ҫ���пɱ���
		// �ȷűȽϹ���Ȼ�����������
		TreeMap<Student, Score> tm = new TreeMap<Student, Score>();
		tm.putAll(hm);
		entrySet = tm.entrySet();
		for (Entry<Student, Score> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("=========================");
		tm = new TreeMap<Student, Score>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		tm.putAll(hm);
		entrySet = tm.entrySet();
		for (Entry<Student, Score> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("=========================");
	}
}

class Student implements Comparable<Student> {
	private int id;
	private String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return id - o.getId();
	}
}

class Score {
	private double eng;
	private double chn;
	private double math;
	private double avg;

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}

	public double getChn() {
		return chn;
	}

	public void setChn(double chn) {
		this.chn = chn;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Score [eng=" + eng + ", chn=" + chn + ", math=" + math + ", avg=" + avg + "]";
	}

	public Score(double eng, double chn, double math) {
		super();
		this.eng = eng;
		this.chn = chn;
		this.math = math;

	}

}