package HomeWork7;

import java.util.ArrayList;
import java.util.Iterator;

public class Util {
	public void show(ArrayList<TransRecord> arrayList,String string) {
		System.out.println("====================="+string+"==============");
		System.out.println("#����"+"\t"+"�Ա�"+"\t"+"�˺�"+"\t"+"���");
		for (Iterator<TransRecord> iterator = arrayList.iterator(); iterator.hasNext();) {
			TransRecord transRecord = (TransRecord) iterator.next();
			System.out.println(transRecord);
		}
	}
	
}
