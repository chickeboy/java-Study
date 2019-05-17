package hk3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*在Arraylist中存放以下数据： 
“张三”、“李四”、“王五”、“张三”、“aaa”、“aaa”、“bbb” 
 要求：去除ArrayList中的重复元素。 */
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		arrayList.add("张三");
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
