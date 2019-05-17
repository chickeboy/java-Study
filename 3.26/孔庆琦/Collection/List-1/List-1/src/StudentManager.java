import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * 提供相应的操作集合的方法的类
 */
public class StudentManager {
	// 保证数据源的唯一性
	private ArrayList<Student> al;

	public StudentManager() {
		// 在创建StudentManager对象的同时也要去为 al开辟空间
		al = new ArrayList<>();
	}

	// 录入五条数据
	public void init() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			Student student = new Student(name, age);// 生成一个新的学生对象
			al.add(student);// 添加数据
		}
	}

	// 这里的去重，指的是录完数据以后再去进行判断操作，不是边录入边判断
	public void remove() {
		ArrayList<Student> newAl = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			// 重写了equals以后Student类判重的依据就发生了改变
			// Api ArrayList contains方法 判断集合中是否包含某一个对象
			// 判断初始依据是存放对象所属类型的equals判重依据
			if (!newAl.contains(al.get(i))) {// 不包含的情况下才进行添加
				newAl.add(al.get(i));
			}
		}
		al = newAl;// 将去重过的新集合的引用赋值给老的集合
	}

	public void show() {
		for (Student student : al) {
			System.out.println(student);
		}
	}
}
