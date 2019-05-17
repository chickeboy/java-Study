package hk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*创建一个字符串集合ArrayList（默认不重复） 
数据 zhangsan,lisi wangwu zhaoliu tianqi 
1.循环录入5条数据 
2.遍历输出集合中所有的数据 
3.查询叫zhangsan的数据 
4.删除lisi,并且打印出删除是否成功 
5.修改下标为3的数据为akak 
6.打印出集合中是否包含 wanger这个名字 
7.有一个新集合 其中数据写死  wangwu zhaoliu  erhuo，添加到第一个集合中 
8.对集合进行排序，提示 使用Collections.sort方法（排序规则就是字典顺序） */
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
		//有一个新集合 其中数据写死  wangwu zhaoliu  erhuo，添加到第一个集合中 
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
		//对集合进行排序，提示 使用Collections.sort方法（排序规则就是字典顺序） */
		Collections.sort(arrayList);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
