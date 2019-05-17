package Lamaba;

import java.util.ArrayList;

public class LamabaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			arrayList.add(i);
		}
		arrayList.forEach(i->System.out.println(i));
	}

}
