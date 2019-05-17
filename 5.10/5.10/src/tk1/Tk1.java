//package tk1;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
///*
// * TreeSet
//  * 底层结构是树型结构，具有排序功能的一个Set集合
//  * 无序，不可重复
//  * 存入TreeSet的数据类型必须具有自然可比性（类的本身实现Comparable）
//  * 还有一种选择就是传入Comparator的实现类对象(比较器)
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
////		System.out.println(t);因为String实现了Comparable
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
//		// 在创建TreeSet的时候就必须给予排序规则，确定好以后该容器
//		// 不能改变排序规则
//		/*
//		 * 1.TreeSet的排序是先确立排序规则 然后在存放数据的时候按照事先写好的规则 进行排列 2.TreeSet也具有去重功能(拦截)
//		 * 去重依据是根据comparTo的返回值来确定 如果返回值是0就表示2个对象是同一个对象
//		 * 
//		 */
//	}
//}
//
////这个比较器Collections Arrays TreeSet都可以使用
////只要是有容器存放Student类型的数据，想要排序
////都可以传入这个比较器的对象
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
