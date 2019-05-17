package homeWork;

/*学校中心配备一台打印机（可以是黑白打印机，也可以是彩色打印机）。
中心可以通过打印机打印学员的个人信息（张三和李四等）。
通过继承和多态来设计这个程序，使程序具有更好的扩展性和维护性。*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Blackandwhiteprinter("黑白打印机");
		Student student = new Student("张三", 15);
		Person person = new Person();
		person.use(student, printer);
		printer = new Colorprinter("彩色");
		student = new Student("李四", 20);
		person.use(student, printer);
	}

}
class Person{
	public void use(Student student,Printer printer) {
		printer.printer(student);
	}
}
class Printer{
	private String name;

	public Printer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public  void  printer(Student student ) {
		System.out.println("使用"+name +"打印了"+ student.toString());
	}
}
class Blackandwhiteprinter extends Printer{

	public Blackandwhiteprinter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class Colorprinter extends Printer{

	public Colorprinter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
