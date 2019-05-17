package tk4;

import java.util.Arrays;

/*
 * 现阶段比较实用的系统接口
 * Comparable  比较器
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
		// Arrays.sort可以对任何数组进行排序
		// 但是有前提要求，排序的数组中存放的对象类型要有可比性
		// 只要将存入对象的类型去实现Comparable接口，
		// 系统就认为你是具有可比性的，会根据你给出的排序依据
		// 帮我们去进行排序
		for (Stu stu : stus) {
			System.out.println(stu);
		}

	}
}
/*
 * 当你的排序规则只有一种的时候，Comparable
 * 因为你是用实体类（存入数组的类型）去实现的
 * compareTo方法的返回值逻辑只能有一种
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
		// 1.先比较id再比较姓名最后比较成绩
		if (id == o.getId()) {
			if (name.compareTo(o.getName()) == 0) {
				return Double.compare(score, o.getScore());
			}
			return name.compareTo(o.getName());
		}
		return id - o.getId();// 这里不会包括0的情况

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
		// 正数（当前对象大） 负数(当前对象小) 0（相等）
	}

}
