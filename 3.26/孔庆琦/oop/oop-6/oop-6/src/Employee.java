
public class Employee extends Person {
	private String position;

	public Employee(String name, int age, String gender, String position) {// 这3个属性属于父类的，那么构造方法也需要调用父类的
		super(name, age, gender);
		this.position = position;// 子类特有的成员属性需要手动赋值
		// TODO Auto-generated constructor stub
	}

	// 继承关系。父类具有有参的构造方法，子类也需要有一个有参的构造方法
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + ",position:" + position;// 子类的特有属性和父类的toString（）相结合
	}

	@Override
	public boolean equals(Object obj) {
		// 规则我自己来定
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (getClass() != obj.getClass()) {
			return false;// 这里表示如果当前对象的类型和外部传入对象的类型不同则直接返回false
		}
		Employee employee = (Employee) obj;// 向下转型
		// 这里的equals是属于String，它已经重写过了，比较的是字符串的值
		if (getName().equals(employee.getName()) && getGender().equals(employee.getGender())
				&& getAge() == employee.getAge() && position.equals(employee.getPosition())) {
			return true;

		}
		return false;
	}
}
