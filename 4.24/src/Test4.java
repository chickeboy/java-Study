
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B("ÍõÎå",5);
		b.name();;
		
	}

}
class B{
	String name;
	int age;
	public B (String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void name() {
		System.out.println(age+"\t"+name);
	}
}
