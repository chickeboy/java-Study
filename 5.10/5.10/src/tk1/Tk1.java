//package tk1;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
///*
// * TreeSet
//  * �ײ�ṹ�����ͽṹ�����������ܵ�һ��Set����
//  * ���򣬲����ظ�
//  * ����TreeSet���������ͱ��������Ȼ�ɱ��ԣ���ı���ʵ��Comparable��
//  * ����һ��ѡ����Ǵ���Comparator��ʵ�������(�Ƚ���)
// */
//public class Tk1 {
//	public static void main(String[] args) {
//		TreeSet<Student> ts = new TreeSet<Student>();
////		TreeSet<String> t = new TreeSet<String>();
////		t.add("ff");
////		t.add("xx");
////		t.add("aa");
////		t.add("zz");
////		t.add("ee");
////		System.out.println(t);��ΪStringʵ����Comparable
//
//		ts.add(new Student(3, "ff"));
//		ts.add(new Student(3, "b"));
//		ts.add(new Student(3, "c"));
//		ts.add(new Student(4, "a"));
//		ts.add(new Student(5, "a"));
//		System.out.println(ts);
//		TreeSet<Student> t = new TreeSet<Student>(new CompareByName());
//		t.addAll(ts);
//		ts = t;
//		System.out.println("=================");
//		System.out.println(ts);
//		// �ڴ���TreeSet��ʱ��ͱ�������������ȷ�����Ժ������
//		// ���ܸı��������
//		/*
//		 * 1.TreeSet����������ȷ��������� Ȼ���ڴ�����ݵ�ʱ��������д�õĹ��� �������� 2.TreeSetҲ����ȥ�ع���(����)
//		 * ȥ�������Ǹ���comparTo�ķ���ֵ��ȷ�� �������ֵ��0�ͱ�ʾ2��������ͬһ������
//		 * 
//		 */
//	}
//}
//
////����Ƚ���Collections Arrays TreeSet������ʹ��
////ֻҪ�����������Student���͵����ݣ���Ҫ����
////�����Դ�������Ƚ����Ķ���
//class CompareByName implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//
//}
//
//class Student implements Comparable<Student> {
//	private int id;
//	private String name;
//
//	public Student(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}
//
//	@Override
//	public int compareTo(Student o) {
//		System.out.println("..." + (id - o.getId()));
//		return id - o.getId();
//	}
//
//}
