package HK1;

/*创建一个学生类，完成以下要求
(1)具有属性id,name,age
(2)提供对应的全参数构造方法和无参构造方法
(3)提供对应的set和get方法
(4)编写一个show方法，展示自身所有属性要求格式：姓名:xxx	id:xxx	age:xx
(5)在main函数中分别创建2个对象，调用对应的show方法对比参数*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1,"张三",20);
		System.out.println(student.show());
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("李四");
		student2.setAge(22);
		System.out.println(student2.show());
	}

}
