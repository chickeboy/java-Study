/*
 * �ֲ������ͳ�Ա���Ե�����
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		Person2 person = new Person2();
		person.name = "aa";// ��
		String name = "����";
		person.play(name);
		person.name = "bbbbb";
		person.play(name);
		person.play(name);
		Person2 person2 = new Person2();
		person2.name = "bb";
		person2.play(name);
	}
}

class Person2 {
	String name;// ��Ա����
	// �ֲ�������nameÿ�η��������õ�ʱ��
	// �Ż����ɣ���������������ʧ
	// Ҳ����ÿ�η������õ�ʱ����Ҫ��һ��
	// �µ�ʵ�ν��뵽����

	public void play(String name) {
		// �����־ֲ������ͳ�Ա����������ʱ��
		// ��ǰ����ĳ�Ա���Ծ���this.ȥ���������
		System.out.println(this.name + "��" + name + "��");
	}

}