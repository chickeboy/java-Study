/*
 * ����һ��Student�࣬��������id,name
 classId Ҫ��classIdĬ��ֵ��1901������2������
 �ֱ�ֵ��������
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
