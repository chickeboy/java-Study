package hk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*����һ���ַ�������ArrayList��Ĭ�ϲ��ظ��� 
���� zhangsan,lisi wangwu zhaoliu tianqi 
1.ѭ��¼��5������ 
2.����������������е����� 
3.��ѯ��zhangsan������ 
4.ɾ��lisi,���Ҵ�ӡ��ɾ���Ƿ�ɹ� 
5.�޸��±�Ϊ3������Ϊakak 
6.��ӡ���������Ƿ���� wanger������� 
7.��һ���¼��� ��������д��  wangwu zhaoliu  erhuo����ӵ���һ�������� 
8.�Լ��Ͻ���������ʾ ʹ��Collections.sort�����������������ֵ�˳�� */
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scanner = new Scanner(System.in);
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("zhangsan");
		arrayList.add("lisi");
		arrayList.add("wangwu");
		arrayList.add("zhaoliu");
		arrayList.add("tianqi");
		//for (int i = 0; i < 5; i++) {
			//String str = scanner.next();
			//arrayList.add(str);
		//}
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("================================");
		System.out.println(arrayList.indexOf("zhangsan"));
		System.out.println(arrayList.remove("lisi"));
		arrayList.add(3,"akak");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("============================");
		System.out.println(arrayList.contains("wanger"));
		//��һ���¼��� ��������д��  wangwu zhaoliu  erhuo����ӵ���һ�������� 
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("wangwu");
		arrayList2.add("zhaoliu");
		arrayList2.add("erhuo");
		arrayList.addAll(arrayList2);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("==================================");
		//�Լ��Ͻ���������ʾ ʹ��Collections.sort�����������������ֵ�˳�� */
		Collections.sort(arrayList);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
