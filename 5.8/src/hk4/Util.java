package hk4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Util {
	public <T>void show(List<T> t) {
		for (Iterator iterator = t.iterator(); iterator.hasNext();) {
			@SuppressWarnings("unchecked")
			T t2 = (T) iterator.next();
			System.out.println(t2);
		}
	}
	public void show2(List<car> aCars) {
		Collections.sort(aCars,new Comparator<car>() {

			public int compare(car o1, car o2) {
				// TODO Auto-generated method stub
				return o1.getSumMoney()-o2.getSumMoney();
			}
		});
		for (Iterator iterator = aCars.iterator(); iterator.hasNext();) {
			car car = (car) iterator.next();
			System.out.println(car);
		}
	}
}
