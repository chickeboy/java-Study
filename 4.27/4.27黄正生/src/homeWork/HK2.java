package homeWork;

/*ѧУ�����䱸һ̨��ӡ���������Ǻڰ״�ӡ����Ҳ�����ǲ�ɫ��ӡ������
���Ŀ���ͨ����ӡ����ӡѧԱ�ĸ�����Ϣ�����������ĵȣ���
ͨ���̳кͶ�̬������������ʹ������и��õ���չ�Ժ�ά���ԡ�*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Blackandwhiteprinter("�ڰ״�ӡ��");
		Student student = new Student("����", 15);
		Person person = new Person();
		person.use(student, printer);
		printer = new Colorprinter("��ɫ");
		student = new Student("����", 20);
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
		System.out.println("ʹ��"+name +"��ӡ��"+ student.toString());
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
