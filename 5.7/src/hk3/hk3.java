package hk3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*��Arraylist�д���������ݣ� 
���������������ġ��������塱��������������aaa������aaa������bbb�� 
 Ҫ��ȥ��ArrayList�е��ظ�Ԫ�ء� */
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i+1; j < arrayList.size(); j++) {
				if(arrayList.get(i).equals(arrayList.get(j))) {
					arrayList.remove(j);
				}
			}
		}
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
