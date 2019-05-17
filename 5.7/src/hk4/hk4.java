package hk4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*创建一个字符串类型的集合，用来存放学生姓名信息 题目中是否成功是否存在都要有提示
(1)编写一个方法，手动录入5条数据
(2)编写一个方法，使用普通for循环遍历集合输出
(3)编写一个方法，使用增强for循环遍历集合输出
(4)编写一个方法，使用迭代器循环遍历集合输出
(5)编写一个方法，键盘输入一个名字，查询是否存在
(6)编写一个方法，键盘输入一个名字，显示出集合中出现的该名字（比如3个张三，就打印出3个张三）
(7)编写一个方法，键盘输入一个名字，进行删除，输出是否成功（默认唯一的）
(8)编写一个方法，键盘输入一个名字，删除所有对应的名字
(9)编写一个方法，键盘输入一个名字，获取这个名字所对对应的下标(默认唯一的名字)
(10)编写一个方法，键盘输入一个名字，获取这个名字所对应的下标(默认重复的)，并且打印输出所有下标
(11)编写一个方法，创建一个集合，里面存放几条数据，将这个集合中的内容，添加到原集合中
(12)编写一个方法，创建一个集合，里面存放几条数据，删除两个集合的交集
(13)编写一个方法，创建一个集合，里面存放几条数据，获取两个集合的交集
(14)编写一个方法，通过创建一个比较器，对集合进行排序，排序规则：根据名字长度排序
(15)编写一个方法，通过匿名内部类对集合进行排序，排序规则先根据名字长度排序，长度相同比较字典顺序
(16)编写一个方法，键盘输入一个名字然后修改这个名字对应的位置的值为”abc”
(17)编写一个方法，使用al.remove方法删除键盘输入的所有的名字
(18)编写一个方法，将集合中的元素存放在数组中进行遍历输出（不要手动复制）*/
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		/*
		 * Scanner scanner = new Scanner(System.in); for (int i = 0; i < 5; i++) {
		 * String string = scanner.next(); arrayList.add(string); }
		 */
		// 编写一个方法，手动录入5条数据(上面注释的)
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		arrayList.add("张三");
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		// 编写一个方法，使用普通for循环遍历集合输出
		math1(arrayList);
		System.out.println("==============1=================");
		// 编写一个方法，使用增强for循环遍历集合输出
		math2(arrayList);
		System.out.println("==============2=================");
		// 编写一个方法，使用迭代器循环遍历集合输出
		math3(arrayList);
		System.out.println("==============3=================");
		// 编写一个方法，键盘输入一个名字，查询是否存在
		System.out.println(math4(arrayList));
		System.out.println("===============4================");
		// 编写一个方法，键盘输入一个名字，显示出集合中出现的该名字（比如3个张三，就打印出3个张三）
		math5(arrayList);
		System.out.println("==============5=================");
		// 编写一个方法，键盘输入一个名字，进行删除，输出是否成功（默认唯一的）
		System.out.println(math6(arrayList));
		System.out.println("==============6=================");
		// 编写一个方法，键盘输入一个名字，删除所有对应的名字
		math7(arrayList);
		System.out.println("=============7==================");
		// 编写一个方法，键盘输入一个名字，获取这个名字所对对应的下标(默认唯一的名字)
		int b = math8(arrayList);
		if (b != -1) {
			System.out.println(b);
		} else {
			System.out.println("没有找到");
		}
		System.out.println("=============8==================");
		// 编写一个方法，键盘输入一个名字，获取这个名字所对应的下标(默认重复的)，并且打印输出所有下标
		math9(arrayList);
		System.out.println("=============9==================");
		// 编写一个方法，创建一个集合，里面存放几条数据，将这个集合中的内容，添加到原集合中
		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("aaa");
		arrayList2.add("ac");
		arrayList2.add("bba");
		arrayList2.add("cd");
		for (Iterator iterator = math10(arrayList, arrayList2).iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("============10===================");
		// (12)编写一个方法，创建一个集合，里面存放几条数据，删除两个集合的交集
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		arrayList.add("张三");
		arrayList.add("aa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		for (Iterator iterator = math11(arrayList, arrayList2).iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("==============11=================");
		// 编写一个方法，创建一个集合，里面存放几条数据，获取两个集合的交集
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		arrayList.add("张三");
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		for (Iterator iterator = math12(arrayList, arrayList2).iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("===============12================");
		arrayList.add("acc");
		arrayList.add("bbb");
		arrayList.add("caaaaa");
		arrayList.add("acbba");
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		// 编写一个方法，通过创建一个比较器，对集合进行排序，排序规则：根据名字长度排序
		Compare2 compare2 = new Compare2();
		Collections.sort(arrayList,compare2);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("============13===================");
		// 通过匿名内部类对集合进行排序，排序规则先根据名字长度排序，长度相同比较字典顺序
		Comparator1 comparator1 = new Comparator1();
		Collections.sort(arrayList, comparator1);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("==============14=================");
		// 编写一个方法，键盘输入一个名字然后修改这个名字对应的位置的值为”abc”
		math14(arrayList);
		System.out.println("===============15================");
		// 编写一个方法，使用al.remove方法删除键盘输入的所有的名字
		math15(arrayList);
		System.out.println("==============16=================");
		//编写一个方法，将集合中的元素存放在数组中进行遍历输出（不要手动复制）*/
		 Object array[] = math16(arrayList);
		for (Object object : array) {
			System.out.println(object);
		}
	}

	private static Object[]  math16(List<String> arrayList) {
		// TODO Auto-generated method stub
		return arrayList.toArray();
	}

	private static void math15(List<String> arrayList) {
		// TODO Auto-generated method stub
		// 编写一个方法，使用al.remove方法删除键盘输入的所有的名字
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "aaa";
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equals(str)) {
				// al.remove(string);
				iterator.remove();
			}
		}
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
	}

	private static void math14(List<String> arrayList) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "aaa";
		arrayList.add(arrayList.indexOf(str), "abc");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	private static void math13(List<String> arrayList) {
		// TODO Auto-generated method stub
		
	}

	private static List<String> math12(List<String> arrayList, List<String> arrayList2) {
		// 编写一个方法，创建一个集合，里面存放几条数据，获取两个集合的交集
		// TODO Auto-generated method stub
		arrayList.retainAll(arrayList2);
		return arrayList;
	}

	private static List<String> math11(List<String> arrayList, List<String> arrayList2) {
		// TODO Auto-generated method stub
		arrayList.removeAll(arrayList2);
		return arrayList;
	}

	private static List<String> math10(List<String> arrayList, List<String> arrayList2) {
		// TODO Auto-generated method stub
		// 编写一个方法，创建一个集合，里面存放几条数据，将这个集合中的内容，添加到原集合中
		arrayList.addAll(arrayList2);
		return arrayList;
	}

	private static void math9(List<String> arrayList) {
		// TODO Auto-generated method stub
		// 编写一个方法，键盘输入一个名字，获取这个名字所对应的下标(默认重复的)，并且打印输出所有下标
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "张三";
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).equals(str)) {
				System.out.println(i);
			}
		}
	}

	private static int math8(List<String> arrayList) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "李四";
		return arrayList.indexOf(str);
	}

	private static void math7(List<String> arrayList) {
		// TODO Auto-generated method stub
		// 编写一个方法，键盘输入一个名字，删除所有对应的名字
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "aaa";
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equals(str)) {
				// al.remove(string);
				iterator.remove();
			}
		}
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
	}

	private static boolean math6(List<String> arrayList) {
		// TODO Auto-generated method stub
		// 编写一个方法，键盘输入一个名字，进行删除，输出是否成功（默认唯一的）
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "张三";
		return arrayList.remove(str);
	}

	private static void math5(List<String> arrayList) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "张三";
		//str = scanner.next();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (string.equals(str)) {
				System.out.println(string);
			}
		}

	}

	public static void math1(List<String> arrayList) {
		// 编写一个方法，使用普通for循环遍历集合输出
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

	public static void math2(List<String> arrayList) {
		// 编写一个方法，使用增强for循环遍历集合输出
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

	public static void math3(List<String> arrayList) {
		// 编写一个方法，使用迭代器循环遍历集合输出
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	public static boolean math4(List<String> arrayList) {
		// 编写一个方法，键盘输入一个名字，查询是否存在
		//Scanner scanner = new Scanner(System.in);
		//String string = scanner.next();
		String string = "aaa";
		if (arrayList.indexOf(string) != -1) {
			return true;
		} else {
			return false;
		}
	}
}
