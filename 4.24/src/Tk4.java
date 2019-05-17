/*
 * 创建一个Student类，具有属性id,name
 classId 要求classId默认值是1901，创建2个对象
 分别赋值，输出结果
 */
public class Tk4 {
	public static void main(String[] args) {
		Student1 student = new Student1();
		student.name = "ko";
		student.id = 23;
		student.classId = 1902;
		System.out.println(student.id + "," + 
		student.name + "," + student.classId);
	}
}

class Student1 {
	int id;
	String name;
	int classId = 1901;
}
