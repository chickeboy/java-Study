public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person person = new Person();
			person.name = "����";    
			String name = "��";
			person.eat(name);
	}
}
class Person{
	String name;
	public void name() {
	} void eat(String name) {
		System.out.print(this.name+ "��"+name);
	}
}