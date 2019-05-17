
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComPare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List< String> arrayList = new ArrayList<String>();
		arrayList.add("aa");
		arrayList.add("ba");
		arrayList.add("aacc");
		arrayList.add("ccaa");
		arrayList.add("ca");
		Compare compare = new Compare();
		Collections.sort(arrayList,compare);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
class Compare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String str1 = (String)o1;
		String str2 = (String)o2;
		return str1.compareTo(str2);
	}
}