/*
 * alt + /
 * ctrl + shif + f �Զ��Ű�
 * ������� oop
 * �������ı���:���ǽ������ϵ�ʵ�ﶼ������һ��
 * һ���ľ���ʵ����Ȼ���ٴ�����ͨ��������Щ
 * ʵ��������ȡ�������ϵ���Ϊ������
 * �Ӷ���������������Ժ���չ��
 * 
 * class ��
 * �����й������Ժ���Ϊ��������ɳ�һ����
 * ��ʵ���ǳ�����ȡ
 * һ��.java�ļ��п��Դ��ڶ����
 * ������public���ε���ֻ��һ��
 * Ҳ�������е�ʱ���ҵ�����
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		Person1 person = new Person1();
		person.name = "����";
		person.age = 11;
		// �����ʵ��������
		// ����һ��������� ���ֽ�person
		System.out.println(person.name);
		System.out.println(person.age);
		person.eat();
		Person1 person2 = new Person1();
		System.out.println(person2.name);
		System.out.println(person2.age);
		// person �� person2����һ����
		/*
		 * ��һ���ഴ�������Ķ������ ���е����Ժ���Ϊ��һ���� �������Եľ���ֵ ����Ϊ�ľ���ʵ�� �߼����ܲ�һ������Ҷ��Ƕ�����
		 */
	}
}

/*
 * ������ ���� ��̬������(ȫ�ֱ���) 
 * ���췽�� ��̬�Ķ��� ��ͨ���� ͳ��Ϊ ��Ϊ
 */
class Person1 {
	String name;// name����һ����Ա���ԣ�ȫ�ֱ���
	int age;

	public void eat() {
		System.out.println(name + "�Է�");
	}
}
