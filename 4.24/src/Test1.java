/*创建一个Student类，具有属性id,name
classId 要求classId默认值是1901，创建2个对象
分别赋值，输出结果*/

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.id = 1;
		student.name = "张三";
		student.out();
		student.id = 2;
		student.name = "李四";
		student.classId = 1902;
		student.out();
	}

}
class Student{
	int id;
	String name;
	int classId = 1901;
	public void out() {
		System.out.println(id+"号" +name+"在"+classId+"班");
	}
}
