package hk4;

import java.util.Iterator;
import java.util.TreeSet;

/*��TreeSet�洢�������ݣ� 
��xiaoqiang���� ��zhangsan������lisi������xiaohua���� ��ruhua���� ��wangcai�� 
Ҫ�����ַ����ĳ��Ƚ���������ٴ洢�����������ͬ�����ַ�������Ȼ˳������ */
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
