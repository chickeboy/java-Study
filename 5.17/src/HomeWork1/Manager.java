package HomeWork1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {
	File file;
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;
	ObjectInputStream objectInputStream;
	ObjectOutputStream objectOutputStream;
	public Manager(File file) {
		super();
		this.file = file;
	}
	public ArrayList<String> add() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("chenhao");
		arrayList.add("zhangsan");
		arrayList.add("zhangsan");
		arrayList.add("chenhao");
		arrayList.add("lisi");
		arrayList.add("wangwu");
		arrayList.add("zhaoliu");
		arrayList.add("xiaoqiang");
		arrayList.add("Haha");
		Collections.sort(arrayList,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length()!=o2.length()) {
					return o1.length()-o2.length();
				} else {
					return o1.compareTo(o2);
				}
			}
		});
		return arrayList;	
	}
	public void write(ArrayList<String> arrayList) {
		try {
			fileOutputStream  = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(arrayList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ArrayList<String> read() {
		ArrayList<String> arrayList = new ArrayList<String>();
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			arrayList = (ArrayList<String>) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}
}
