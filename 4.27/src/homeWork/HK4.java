package homeWork;

/*1������һ��(Person)��,�������ԣ����������䣬�Ա�д����صķ������ܹ������ʱ���ʼ������

�����޸�����ֵ��
2������һ��Employee��̳���Person�࣬�����µ����ԣ�ְλ��д����صķ������ܹ������ʱ���ʼ

�����ߺ����޸�����ֵ����дequals���������򣺵�������������������䣬�Ա�ְλ�����ʱ����

true�����򷵻�false��
3��дһ�������������ز��ԣ�Ҫ����Դ�ӡ�������Ϣ���ܹ��Ƚ϶����Ƿ�"���"����*/
public class HK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("����", 20, "��", "��������");
		Employee employee2 = new Employee("����", 20, "��", "��������");
		Employee employee3 = new Employee("����", 20, "��", "��������");
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
