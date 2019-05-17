import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* 创建Student 类 具有属性id name score
 *1.创建HashSet存放5条数据，判重依据是id
 *2.使用TreeSet对数据进行排序，排序依据是id
 *3.使用TreeSet继续排序，排序依据是name;
 *4.使用TreeSet继续排序，排序依据是name相同比较score(相同的保留)*/

public class kt {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student(3, "aa", 56));
		hashSet.add(new Student(1, "ca", 89));
		hashSet.add(new Student(1, "bbac", 80));
		hashSet.add(new Student(4, "bc", 89));
		hashSet.add(new Student(5, "cab", 80));
		for (Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.addAll(hashSet);
		System.out.println(treeSet);
		TreeSet<Student> treeSet2 = new TreeSet<Student>(new Compare());
		treeSet2.addAll(treeSet);
		System.out.println(treeSet2);
		TreeSet<Student> treeSet3 = new TreeSet<Student>(new Compare2());
		treeSet3.addAll(treeSet2);
		System.out.println(treeSet3);
	}
}
