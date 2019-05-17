/*
 * 编写一个类Student，代表学员，要求：
1)具有属性：姓名、年龄、性别、专业
2)具有方法：自我介绍，负责输出该学员的姓名、年龄、性别以及专业
3)具有两个带参数的构造方法：
第一个构造方法中，设置学员的性别为男，专业为Android，
其余属性的值由参数给定；第二个构造方法中，所有属性都由参数给定
编写测试类StudentTest进行测试，分别以两种方式对两个Student对象进行初始化，
并分别调用他们的自我介绍方法，看看输出结果是否正确。
 */
public class Student {
	private String name;// 成员属性一定要私有化
	private int age;
	private String gender;
	private String profession;

	// 私有化的成员属性外部无法直接访问，需要提供对应的get 和 set方法
	public void setName(String name) {
		this.name = name;// 为什么要用this去修饰，因为外部传入的参数和成员属性变量名重复，那么用this.去代表当前对象的变量，成员属性
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void show() {
		System.out.println("name:" + name + "age:" + age + "gender:" + gender + "profession:" + profession);
	}

	// 构造方法1
	public Student(String name, int age) {
		gender = "男";
		profession = "android";
		this.name = name;
		this.age = age;
	}

	// 构造方法2
	public Student(String name, int age, String gender, String profession) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.profession = profession;
	}
}
