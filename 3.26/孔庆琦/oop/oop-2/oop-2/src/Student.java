/*
 * ��дһ����Student������ѧԱ��Ҫ��
1)�������ԣ����������䡢�Ա�רҵ
2)���з��������ҽ��ܣ����������ѧԱ�����������䡢�Ա��Լ�רҵ
3)���������������Ĺ��췽����
��һ�����췽���У�����ѧԱ���Ա�Ϊ�У�רҵΪAndroid��
�������Ե�ֵ�ɲ����������ڶ������췽���У��������Զ��ɲ�������
��д������StudentTest���в��ԣ��ֱ������ַ�ʽ������Student������г�ʼ����
���ֱ�������ǵ����ҽ��ܷ����������������Ƿ���ȷ��
 */
public class Student {
	private String name;// ��Ա����һ��Ҫ˽�л�
	private int age;
	private String gender;
	private String profession;

	// ˽�л��ĳ�Ա�����ⲿ�޷�ֱ�ӷ��ʣ���Ҫ�ṩ��Ӧ��get �� set����
	public void setName(String name) {
		this.name = name;// ΪʲôҪ��thisȥ���Σ���Ϊ�ⲿ����Ĳ����ͳ�Ա���Ա������ظ�����ô��this.ȥ����ǰ����ı�������Ա����
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

	// ���췽��1
	public Student(String name, int age) {
		gender = "��";
		profession = "android";
		this.name = name;
		this.age = age;
	}

	// ���췽��2
	public Student(String name, int age, String gender, String profession) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.profession = profession;
	}
}
