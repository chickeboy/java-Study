
public class Employee extends Person {
	private String position;

	public Employee(String name, int age, String gender, String position) {// ��3���������ڸ���ģ���ô���췽��Ҳ��Ҫ���ø����
		super(name, age, gender);
		this.position = position;// �������еĳ�Ա������Ҫ�ֶ���ֵ
		// TODO Auto-generated constructor stub
	}

	// �̳й�ϵ����������вεĹ��췽��������Ҳ��Ҫ��һ���вεĹ��췽��
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + ",position:" + position;// ������������Ժ͸����toString��������
	}

	@Override
	public boolean equals(Object obj) {
		// �������Լ�����
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (getClass() != obj.getClass()) {
			return false;// �����ʾ�����ǰ��������ͺ��ⲿ�����������Ͳ�ͬ��ֱ�ӷ���false
		}
		Employee employee = (Employee) obj;// ����ת��
		// �����equals������String�����Ѿ���д���ˣ��Ƚϵ����ַ�����ֵ
		if (getName().equals(employee.getName()) && getGender().equals(employee.getGender())
				&& getAge() == employee.getAge() && position.equals(employee.getPosition())) {
			return true;

		}
		return false;
	}
}
