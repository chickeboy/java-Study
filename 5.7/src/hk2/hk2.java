package hk2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*����һ��List�������� 
List <String>list = new ArrayList<String>(); 

1) ��list�����Ԫ�أ�nihao,wohao,dajiahao,nihao 
2) ��list�ĵڶ���λ�����Ԫ�أ�tahao 
) ��Iterator������������ӡlist��Ԫ�� */
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("nihao");
		arrayList.add("wohao");
		arrayList.add("dajiahao");
		arrayList.add("nihao");
		arrayList.add(2,"tahao");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
	}

}
