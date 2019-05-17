package HomeWork3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Manager {
	File file;
	FileReader fileReader;
	FileWriter fileWriter;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	public Manager(File file) {
		super();
		this.file = file;
	}

	public ArrayList<Integer> addArrayList() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int a = 1;
		int b = 1;
		int c = 0;
		for (int i = 0; i < 20; i++) {
			c = a + b;
			arrayList.add(a);
			a = b;
			b = c;
		}
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println("==========================");
		return arrayList;
	}

	public void write(ArrayList<Integer> arrayList) {
		try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				String str = Integer.toString(integer);
				bufferedWriter.write(str);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void read() {
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			int count= 0;
			String str = null;
			while ((str=bufferedReader.readLine())!=null) {
				count++;
				if (count==12) {
					System.out.println(str);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
