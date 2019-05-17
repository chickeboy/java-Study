package hk2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*2.  使用listIterator获取学生对象
 * 在迭代器中添加一个学号为4，名字叫 a 成绩为99的学生
 遍历，删除 学号为4的学生，
 修改学号为5的学员的name 为 666*/
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> arrayList = new ArrayList<Student>();
		ListIterator<Student> listIterator = arrayList.listIterator();
		listIterator.add(new Student(4, "a", 99));
		listIterator.add(new Student(5, "aa", 99));
		listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {		
			System.out.println(listIterator.next());
		}
		listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			Student student = listIterator.next();
			if (student.getId()==4) {
				listIterator.remove();
			}
		}
		listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			Student student = listIterator.next();
			if (student.getId()==5) {
				listIterator.set(new Student(5,"666",99));
			}
		}
		listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			Student student = listIterator.next();
			System.out.println(student);
		}
	}
}
