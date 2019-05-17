package TK2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ManagerUtil {
	ArrayList<Student> arrayList;
	File file;
	FileReader fileReader;
	FileWriter fileWriter;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	
	public ManagerUtil(ArrayList<Student> arrayList, File file) {
		super();
		this.arrayList = arrayList;
		this.file = file;
	}
	public ArrayList<Student> add() {
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student(1, "张三", 86));
		hashSet.add(new Student(1, "李四", 78));
		hashSet.add(new Student(2, "王五", 90));
		hashSet.add(new Student(3, "赵六", 60));
		hashSet.add(new Student(4, "小名", 69));
		arrayList.addAll(hashSet);
		return arrayList;
	}
	public void utilWrite() {
		try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			for (Iterator linkedList = arrayList.iterator(); linkedList.hasNext();) {
				Student student = (Student) linkedList.next();
				bufferedWriter.write(student.WriteToString());
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public ArrayList<Student> utilRead() {
		ArrayList<Student> arrayList2 = new ArrayList<Student>();
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String str = null;
			while ((str=bufferedReader.readLine())!=null) {
				String [] strarray = str.split(":");
				int id = Integer.parseInt(strarray[0]);
				String name = strarray[1];
				int score = Integer.parseInt(strarray[2]);
				arrayList2.add(new Student(id, name, score));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList2;
	}
}
