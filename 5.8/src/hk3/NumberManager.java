package hk3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberManager {
	List<Integer> arrayList;
	List<Number> aList;
	public NumberManager(List<Integer> arrayList) {
		super();
		this.arrayList = arrayList;
	}
	public void count() {
		System.out.println("count方法");
		aList = new ArrayList<Number>();
		int i = 35;
		while (i>=30) {
			int count = 0;
			for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				if (integer==i) {
					count++;
				}
			}
			if (count!=0&&!pangchoong(count)) {
				aList.add(new Number(i, count));
			}
			i--;
		}
		for (Iterator<Number> iterator = aList.iterator(); iterator.hasNext();) {
			Number number = (Number) iterator.next();
			System.out.println(number);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		int max = 0;
		for (Iterator<Number> iterator = aList.iterator(); iterator.hasNext();) {
			Number number = (Number) iterator.next();
			if (number.getCount()>max) {
				max = number.getCount();
			}
		}
		int index = aList.indexOf(new Number(max));
		System.out.println("出现次数最多的是"+aList.get(index).getNumber()+",出现了"+aList.get(index).getCount()+"次");
	}
	public boolean pangchoong(int count) {
		return aList.contains(new Number(count));
	}
}
