package hk4;

import java.util.Iterator;
import java.util.TreeSet;

/*用TreeSet存储以下数据： 
“xiaoqiang”、 “zhangsan”、“lisi”、“xiaohua”、 “ruhua”、 “wangcai” 
要求按照字符串的长度进行排序后再存储（如果长度相同，则按字符串的自然顺序排序） */
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>(new Compare());
		treeSet.add("xiaoqiang");
		treeSet.add("zhangsan");
		treeSet.add("lisi");
		treeSet.add("xiaohua");
		treeSet.add("ruhua");
		treeSet.add("wangcai");
		for (Iterator iterator = treeSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
