package hk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
/*�������50��30��35��������ͳ��ÿ�����ֳ��ֵĴ�����TreeMapʵ�֣���
���ʱ�������ֵĽ������У�����ͳ�Ƴ��ִ����������ֺ����Ĵ�����
PS��������������ֳ��ֵĴ���һ������ֻ���������һ����*/
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		int i = 0;
		int count = 0;
		while (i < 50) {
			treeMap.put(i, (int) Math.floor(Math.random()* 5 + 30));
			i++;
		}
		TreeMap<Integer, Integer> treeMap2 = new TreeMap<Integer, Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		Set<Entry<Integer, Integer>> entrySet = treeMap.entrySet();
		for (int j = 30; j < 36; j++) {
			for (Entry<Integer, Integer> entry : entrySet) {
				if (j==entry.getValue()) {
					count++;
				}
			}
			if (count!=0) {
			treeMap2.put(j, count);
			}
			count=0;
			
		}
		Set<Entry<Integer,Integer>> entrySet2 = treeMap2.entrySet();
		for (Entry<Integer, Integer> entry : entrySet2) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer,Integer>>(treeMap2.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue()-o1.getValue();
			}
		});
		System.out.println("���ִ���������"+treeMap2.firstKey()+"������"+ treeMap2.get(treeMap2.firstKey())+"��");
	}

}
