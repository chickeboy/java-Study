package hk4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/*����һϵ���ַ�����
"chenhao"
"zhangsan"
"zhangsan"
"chenhao"
"lisi"
"wangwu"
"zhaoliu"
"xiaoqiang"
"haha"
��ӡ��������ַ������ֵĴ���
��ʹ��HashMapʵ�֣��������ַ�����ֵ���汣����ֵĴ�����*/
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("chenhao");
		arrayList.add("zhangsan");
		arrayList.add("zhangsan");
		arrayList.add("chenhao");
		arrayList.add("lisi");
		arrayList.add("wangwu");
		arrayList.add("zhaoliu");
		arrayList.add("xiaoqiang");
		arrayList.add("haha");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
		Iterator<String> iterator = arrayList.iterator();
		for (int i = 0; i < arrayList.size(); i++) {
			int count=1;
			iterator.hasNext();
			String string = (String) iterator.next();
			for (Entry<String, Integer> entry : entrySet) {
				if (string.equals(entry.getKey())) {
					count++;
				}
			}
			hashMap.put(string, count);
		}
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
