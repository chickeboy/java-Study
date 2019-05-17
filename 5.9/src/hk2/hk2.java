package hk2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*创建一个Teacher类，具有属性 id,name,sex,score 
使用linkedList进行存储 
1.写一个方法用来录入5名Teacher 
2.写一个方法遍历输出整个集合 
3.写一个方法使用迭代器遍历输出整个集合 */
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Teacher> arrayList = new LinkedList<Teacher>();
		arrayList.add(new Teacher(1, "aa", "男", 84));
		arrayList.add(new Teacher(2, "ac", "女", 67));
		arrayList.add(new Teacher(3, "cca", "女", 89));		
		arrayList.add(new Teacher(4, "ca", "男", 60));
		arrayList.add(new Teacher(5, "rrf", "男", 37));	
		show(arrayList);
		showbyIterator(arrayList);
	}
	public static void show(List<Teacher> teachers) {
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
	}
	public static void showbyIterator(List<Teacher> teachers) {
		for (Iterator iterator = teachers.iterator(); iterator.hasNext();) {
			Teacher teacher = (Teacher) iterator.next();
			System.out.println(teacher);
		}
	}
}
