package hk3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*创建一个学生类，具有属性 id name age score
使用ArrayList存放8个学生对象，有2个对象的属性值相同
然后将ArrayList中的内容复制到HashSet中
通过HashSet去重，然后删除一个叫a的学员信息
再通过年龄排序输出，并且删除成绩最高的，和成绩最低的，并且输出
最后在通过一种排序规则输出：id相同，比姓名，姓名相同，比年龄。输出结果 */
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1,"a", 12, 45));
		arrayList.add(new Student(1,"a", 12, 45));
		arrayList.add(new Student(3,"a", 16, 34));
		arrayList.add(new Student(4,"ac", 35,67));
		arrayList.add(new Student(5,"dd", 65, 87));
		arrayList.add(new Student(6,"accc", 23, 59));
		arrayList.add(new Student(7,"bba", 24, 90));
		arrayList.add(new Student(8,"ww", 22, 92));
		Set<Student> haSet = new HashSet<Student>();
		haSet.addAll(arrayList);
		for (Iterator iterator = haSet.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		System.out.println("=======================================");
		for (Iterator iterator = haSet.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getName().equals("a")) {
				iterator.remove();
			}
		}
		for (Iterator iterator = haSet.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		System.out.println("=======================================");
		arrayList = new ArrayList<Student>(haSet);
		Collections.sort(arrayList,new Comparator<Student>() {		
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		System.out.println("=======================================");
		LinkedList<Student> lindeList = new LinkedList<Student>(arrayList);
		Collections.sort(lindeList,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getScore()-o2.getScore();
			}
		});
		lindeList.removeFirst();
		lindeList.removeLast();
		arrayList = new ArrayList<Student>(lindeList);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		System.out.println("=======================================");
		//最后在通过一种排序规则输出：id相同，比姓名，姓名相同，比年龄。输出结果 
		Collections.sort(arrayList,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if (o1.getId()!=o2.getId()) {
					return o1.getId()-o2.getId();
				} else if(!o1.getName().equals(o2.getName())) {
					return o1.getName().compareTo(o2.getName());
				}else {
					return o1.getAge()-o2.getAge();
				}
				
			}
		});
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
	}

}
