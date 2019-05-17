package tk2;

/*
 * �������ʹ�ó���֮һ
 * ģ��ģʽ:�����г��󷽷�Ҳ����û��ʵ�־�����߼�
 * ���Ǹ����г�����һ�����巽�������Ե�����Щ���󷽷�
 * �����һ���µ����̣�����ĳ��󷽷���������ȥʵ��
 * ��ô��ͬ������ʵ�ַ�ʽ��һ�������Ǹ������������
 * ����
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		JavaTeacher javaTeacher = new JavaTeacher("java��Ա");
		javaTeacher.work();
		CTeacher cTeacher = new CTeacher("C��Ա");
		cTeacher.work();
	}
}

abstract class Teacher {
	private String name;

	// ���еĽ�Ա��ʼ�ͽ����ķ�ʽһ��
	public void start() {
		System.out.println(name + "������");
	}

	// ���еĹ���δ֪
	public abstract void teach();

	public void end() {
		System.out.println(name + "�뿪����");
	}

	// ��start teach end���е���
	public void work() {
		start();
		teach();
		end();
	}

	public Teacher(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}

}

/**
 * ����ĳ�����Ϊ��ʱʵ�֣�����ȴ������ִ�е�˳��
 * 
 * @author lagone
 *
 */
class JavaTeacher extends Teacher {

	public JavaTeacher(String name) {
		super(name);
	}

	@Override
	public void teach() {
		System.out.println(getName() + "��java");
	}

}

class CTeacher extends Teacher {

	public CTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		System.out.println(getName() + "��C����");
	}

}
