import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();//构造函数方式创建
		//List<String> arrayList2 = new ArrayList<String>();
		arrayList.add("aa");
		arrayList.add("ac");//添加
		arrayList.add(1,"cc");//插入
		arrayList.set(0, "v");//修改
		System.out.println("使用迭代器对象进行统一的遍历");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {//while循环遍历
			String string = (String) iterator.next();
			System.out.println(string);
		}
		//for循环遍历
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
		System.out.println(arrayList.indexOf("cc"));//查找首次出现的下标
		
	}
}
