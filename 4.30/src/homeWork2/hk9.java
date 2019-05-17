package homeWork2;

import java.util.Arrays;
import java.util.Comparator;

/*现有一个字符串数组
chenhao
zhangsan
zhangsan
chenhao
lisi
wangwu
zhaoliu
xiaoqiang
Haha
要求：
创建2个比较器，1.根据长度排序
2.线根据长度排序，长度相同根据字母在字典的顺序排序
在线答题上传答案上移下移移除设置分值*/
public class hk9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "chenhao", "zhangsan", "zhangsan", "chenhao", "lisi", "wangwu", "zhaoliu", "xiaoqiang",
				"Haha" };
		Comparator1 comparator1 = new  Comparator1();
		Arrays.sort(array,comparator1);
		for (String string : array) {
			System.out.println(string);
		}
		System.out.println("========================");
		Comparator2 comparator2 = new  Comparator2();
		Arrays.sort(array,comparator2);
		for (String string : array) {
			System.out.println(string);
		}
	}

}
class Comparator1 implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length()-o2.length();
	}
	
}
class Comparator2 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if (o1.length()-o2.length()!=0) {
		return o1.length()-o2.length();
		}else {
		return	o1.compareTo(o2);
		}
	}
	
}