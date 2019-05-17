
class Test1 {
	public static void main(String[] args) {
		Student student = new Student("уехЩ");
		student.toShow();
	}
}
class Father {
	protected String name;
	public Father(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Student extends Father{

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void toShow() {
		System.out.println(name);
	}
	
}
