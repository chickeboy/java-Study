package TK2;

import java.util.ArrayList;
import java.util.Iterator;

public class Util {
	public void show(ArrayList<Student> arrayList) {
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
			System.out.println("===============================");
		}
	}
}
