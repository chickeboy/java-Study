
public class Test3 {
	/*
	 * 创建一个Person类，
	 *  具有属性name age， 
	 *  创建一个Worker类继承与Person类， 
	 *  并且拥有自己的成员属性 id
	 * 提供相应的方法(和第一题一致), 
	 * Person具有自己的行为睡觉，
	 * 要 求输出格式xxx 在睡觉，
	 * 子类Worker重写sleep方法，
	 * 实现逻辑xxx只加班，
	 * 不睡觉。在Test中调用测试
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker woker = new Woker("张三", 25, 1);
		woker.sleep("李四");
	}

}
class Person{
	private String nameString;
	private int age;
	public Person(String nameString, int age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private void sleep() {
		System.out.println(nameString + "在睡觉");
	}
	
}
class Woker extends Person{
	private int id;
	public Woker(String nameString, int age, int id) {
		super(nameString, age);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void sleep(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"只加班，不睡觉");
	}
}