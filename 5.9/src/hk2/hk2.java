package hk2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*����һ��Teacher�࣬�������� id,name,sex,score 
ʹ��linkedList���д洢 
1.дһ����������¼��5��Teacher 
2.дһ��������������������� 
3.дһ������ʹ�õ�������������������� */
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Teacher> arrayList = new LinkedList<Teacher>();
		arrayList.add(new Teacher(1, "aa", "��", 84));
		arrayList.add(new Teacher(2, "ac", "Ů", 67));
		arrayList.add(new Teacher(3, "cca", "Ů", 89));		
		arrayList.add(new Teacher(4, "ca", "��", 60));
		arrayList.add(new Teacher(5, "rrf", "��", 37));	
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
