import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 提供了对存放数据的集合操作的方法
 * 已知有一个学生类，具有属性 id,name,age
要求：
1.创建一个HashSet集合用来存放学生对象
2.编写一个方法循环录入多条数据（不能重复）
3.编写一个方法遍历集合并且输出
4.编写一个方法根据id升序输出（实现Comparable接口）
5.编写一个方法根据age降序输出(实现Comparator接口)
6.创建测试类进行测试

 */
public class StudentManager {
	private HashSet<Student> hs;

	public StudentManager() {
		hs = new HashSet<>();// 通过studentManager的对象的创建来对集合进行创建
	}

	public void init() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			Student student = new Student(name, id, age);// 生成一条数据
			// 这里默认id不能重复
			// 这里需要告知重复的规则
			if (hs.contains(student)) {// 是否包含完全取决于存入对象的equals和hashcode的判重依据
				System.out.println("已经添加过了");
			} else {
				hs.add(student);
				System.out.println("添加成功");
			}
			System.out.println("请问是否要继续，输入n退出");
			String c = scanner.next();
			if (c.equals("n") || c.equals("N")) {
				break;
			}
		}
	}

	public void showAll() {
		for (Student student : hs) {
			System.out.println(student);
		}
	}

	// 通过comapreable接口完成排序
	public void sortById() {
		TreeSet<Student> ts = new TreeSet<>(hs);// 这个构造方法可以将其他集合的内容复制到ts中
		// ts在这里是具有排序功能，但是你一定要交代你存入对象的排序规则
		for (Student student : ts) {
			System.out.println(student);
		}
	}

	public void sortByAge() {
		// ts这里需要先传比较规则，再传数据进去。
		TreeSet<Student> ts = new TreeSet<>(new CompareByAge());
		ts.addAll(hs);
		for (Student student : ts) {
			System.out.println(student);
		}
	}
}
