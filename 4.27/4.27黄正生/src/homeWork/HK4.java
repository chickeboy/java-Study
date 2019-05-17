package homeWork;

/*1）定义一个(Person)类,包含属性：姓名，年龄，性别；写好相关的方法，能够构造的时候初始化或者

后续修改属性值。
2）定义一个Employee类继承于Person类，包含新的属性：职位；写好相关的方法，能够构造的时候初始

化或者后续修改属性值，重写equals方法，规则：当两个对象的姓名，年龄，性别，职位都相等时返回

true，否则返回false。
3）写一个测试类进行相关测试（要求可以打印对象的信息，能够比较对象是否"相等"）。*/
public class HK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("张三", 20, "男", "车间主任");
		Employee employee2 = new Employee("李四", 20, "男", "车间主任");
		Employee employee3 = new Employee("张三", 20, "男", "车间主任");
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1.equals(employee3));
	}

}
class Person1{
	private String name;
	private int age;
	private String sex;
	public Person1(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
class Employee extends Person1{
	private String position;
	String name = getName();
	String sex = getSex();
	int age = getAge();
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}

	public Employee(String name, int age, String sex, String position) {
		super(name, age, sex);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
