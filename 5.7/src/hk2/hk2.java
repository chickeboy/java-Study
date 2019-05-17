package hk2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*定义一个List对象，如下 
List <String>list = new ArrayList<String>(); 

1) 在list中添加元素，nihao,wohao,dajiahao,nihao 
2) 在list的第二个位置添加元素，tahao 
) 用Iterator迭代器遍历打印list中元素 */
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
