
public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("zhangsan", 20);
		Student student2 = new Student("lisi", 23, "Ů", "java");
		student.show();
		student2.show();
	}
}
