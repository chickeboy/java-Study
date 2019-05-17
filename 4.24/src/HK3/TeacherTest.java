package HK3;
/*创建一个Teacher类，要求描述姓名、性别、年龄、薪水，定义一个方法，
用于在教师原有薪水的基础上增加5000，再定义一个TeacherTest类，
创建一个Teacher对象并初始化对象的各属性值，调用教师增加薪水的方法，
并将增加薪水后的教师信息输出*/

class TeacherTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.name = "张三";
		teacher.sex = "男";
		teacher.age = 30;
		teacher.money = 5000;
		teacher.addmoney();
	}
}
