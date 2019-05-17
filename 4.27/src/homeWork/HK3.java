package homeWork;

/*创建一个Worker类

具有属性 id,name,score

要求重写equals 方法，判断2个对象是否相同

判断的依据是名字和id相同就是同一个对象

在Test测试类中创建2个对象进行比较’*/
public class HK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker woker1 = new Woker(1, "张三", 500);
		Woker woker2 = new Woker(1, "张三", 1500);	
			System.out.println(woker1.equals(woker2));
	}

}
class Woker {
	private int id;
	private String name;
	private int score;
	public Woker(int id, String name, int score) {
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Woker other = (Woker) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}