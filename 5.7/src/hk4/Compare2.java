package hk4;

import java.util.Comparator;

public class Compare2 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String str1 =(String)o1;
		String str2 =(String)o2;
		return str1.length()-str2.length();
	}

}
