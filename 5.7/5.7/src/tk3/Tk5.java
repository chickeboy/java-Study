package tk3;

import java.util.ArrayList;
import java.util.Iterator;

public class Tk5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ff");
		al.add("xx");
		al.add("xx");
		al.add("zz");
		al.add("xxxxx");
		// al.add("xx");
		Iterator<String> iterator = al.iterator();
		// ʹ�õ������������ϣ�����ʹ��ArrayList�Ļᵼ���������ݷ����ı�ķ���
		iterator.next();
		iterator.remove();
		iterator.next();
		iterator.remove();
		iterator.next();
		iterator.remove();
		System.out.println(iterator.next());
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			if (string.equals("ff")) {
//				// al.remove(string);
//				iterator.remove();
//			}
//		}
//		for (String string : al) {// for each�ײ���ǵ�����
//			// ��������Ҳ����ʹ��al.remove();
//			if (string.equals("ff")) {
//				al.remove(string);
//			}
//		}
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("ff");
//		al.removeAll(a);

		System.out.println(al);
	}
}
