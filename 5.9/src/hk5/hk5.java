package hk5;

import java.util.Iterator;
import java.util.TreeSet;

import hk4.Compare;

public class hk5 {

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
