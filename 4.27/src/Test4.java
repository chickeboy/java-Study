
public class Test4 {
	/*
	 * 假设现在需要对员工进行建模， 员工包含3个属性：工号、姓名、工资 经理也是员工，除了含有员工的属性外，
	 * 另外还有一个奖金属性。请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker1 woker1 = new Woker1(2, "李四", 500);
		System.out.println(woker1.toString());
		Vipworker vipworker = new Vipworker(1, "张三", 1000, 500);
		vipworker.out();
	}

}

class Woker1 {
	private int id;
	private String nameString;
	private int score;
	public Woker1(int id, String nameString, int score) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Woker [id=" + id + ", nameString=" + nameString + ", score=" + score + "]";
	}
}
class Vipworker extends Woker1{
	private int bonus;

	public Vipworker(int id, String nameString, int score, int bonus) {
		super(id, nameString, score);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void out() {
	System.out.println(toString()+bonus);
	}
}
