package HK1;

/*����һ��ѧ���࣬�������Ҫ��
(1)��������id,name,age
(2)�ṩ��Ӧ��ȫ�������췽�����޲ι��췽��
(3)�ṩ��Ӧ��set��get����
(4)��дһ��show������չʾ������������Ҫ���ʽ������:xxx	id:xxx	age:xx
(5)��main�����зֱ𴴽�2�����󣬵��ö�Ӧ��show�����ԱȲ���*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1,"����",20);
		System.out.println(student.show());
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("����");
		student2.setAge(22);
		System.out.println(student2.show());
	}

}
