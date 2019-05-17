
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Penguin penguin = new Penguin("海豚", 1);
			penguin.eatfood();
			penguin.myId();
	}
}
class Animal1{
	private String name;
	private int id;
	public Animal1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void eatfood() {
		// TODO Auto-generated method stub
		System.out.println(name +"吃东西");
	}
	public void myId() {
		System.out.println("我的id是"+id);
	}
}
class Penguin extends Animal1{

	public Penguin(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	
}
