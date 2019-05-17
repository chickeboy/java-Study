package hk5;

import java.util.Comparator;

public class Compare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if (o1.length()!=o2.length()) {
			return o1.length()-o2.length();
		}else {
			return o1.compareTo(o2);
		}
		
	}

}
