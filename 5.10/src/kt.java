import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* ����Student �� ��������id name score
 *1.����HashSet���5�����ݣ�����������id
 *2.ʹ��TreeSet�����ݽ�����������������id
 *3.ʹ��TreeSet������������������name;
 *4.ʹ��TreeSet������������������name��ͬ�Ƚ�score(��ͬ�ı���)*/

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
