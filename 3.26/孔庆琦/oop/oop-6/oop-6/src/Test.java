
public class Test {
	public static void main(String[] args) {
		//�Ƚ�2�������Ƿ���ͬ
		Employee employee1 = new Employee("a", 2, "n", "����");
		Employee employee2 = new Employee("a", 2, "n", "����");
		System.out.println(employee1==employee2);//����Ƚϵ���ʵ��2�����������ָ���Ƿ���ͬ
		System.out.println(employee1.equals(employee2));//��ʵ����Ĭ�ϵ���object��equals�����Ļ��ȽϵĻ���==
	}
}
