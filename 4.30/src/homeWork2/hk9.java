package homeWork2;

import java.util.Arrays;
import java.util.Comparator;

/*����һ���ַ�������
chenhao
zhangsan
zhangsan
chenhao
lisi
wangwu
zhaoliu
xiaoqiang
Haha
Ҫ��
����2���Ƚ�����1.���ݳ�������
2.�߸��ݳ������򣬳�����ͬ������ĸ���ֵ��˳������
���ߴ����ϴ������������Ƴ����÷�ֵ*/
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