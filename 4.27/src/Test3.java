
public class Test3 {
	/*
	 * ����һ��Person�࣬
	 *  ��������name age�� 
	 *  ����һ��Worker��̳���Person�࣬ 
	 *  ����ӵ���Լ��ĳ�Ա���� id
	 * �ṩ��Ӧ�ķ���(�͵�һ��һ��), 
	 * Person�����Լ�����Ϊ˯����
	 * Ҫ �������ʽxxx ��˯����
	 * ����Worker��дsleep������
	 * ʵ���߼�xxxֻ�Ӱ࣬
	 * ��˯������Test�е��ò���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker woker = new Woker("����", 25, 1);
		woker.sleep("����");
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
		System.out.println(nameString + "��˯��");
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
		System.out.println(name+"ֻ�Ӱ࣬��˯��");
	}
}