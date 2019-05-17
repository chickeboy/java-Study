package Map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Util {
	@SuppressWarnings("hiding")
	public <Integer, Book> void show(Map<Integer, Book> map) {
		Set<Entry<Integer,Book>> entrySet = map.entrySet();
		for (Iterator<Entry<Integer, Book>> iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<Integer, Book> entry = (Entry<Integer, Book>) iterator.next();
			System.out.print("id="+entry.getKey()+",");
			System.out.println(entry.getValue());
		}
		System.out.println("==========================================");
	}
	public <Integer, Book> void showlist(List<Entry<Integer, Book>> list) {
		Iterator<Entry<Integer, Book>> iterator = list.iterator();
		for (Entry<Integer, Book> entry : list) {
			System.out.print("id="+entry.getKey()+",");
			System.out.println(entry.getValue());
		}
	}
}
