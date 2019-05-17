package HomeWork7;

import java.util.ArrayList;
import java.util.Iterator;

public class Util {
	public void show(ArrayList<TransRecord> arrayList,String string) {
		System.out.println("====================="+string+"==============");
		System.out.println("#姓名"+"\t"+"性别"+"\t"+"账号"+"\t"+"金额");
		for (Iterator<TransRecord> iterator = arrayList.iterator(); iterator.hasNext();) {
			TransRecord transRecord = (TransRecord) iterator.next();
			System.out.println(transRecord);
		}
	}
	
}
