/*����һ��Student�࣬��������id,name
classId Ҫ��classIdĬ��ֵ��1901������2������
�ֱ�ֵ��������*/

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.id = 1;
		student.name = "����";
		student.out();
		student.id = 2;
		student.name = "����";
		student.classId = 1902;
		student.out();
	}

}
class Student{
	int id;
	String name;
	int classId = 1901;
	public void out() {
		System.out.println(id+"��" +name+"��"+classId+"��");
	}
}
