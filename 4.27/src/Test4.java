
public class Test4 {
	/*
	 * ����������Ҫ��Ա�����н�ģ�� Ա������3�����ԣ����š����������� ����Ҳ��Ա�������˺���Ա���������⣬
	 * ���⻹��һ���������ԡ���ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker1 woker1 = new Woker1(2, "����", 500);
		System.out.println(woker1.toString());
		Vipworker vipworker = new Vipworker(1, "����", 1000, 500);
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
