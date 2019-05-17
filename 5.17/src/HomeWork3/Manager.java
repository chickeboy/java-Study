package HomeWork3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

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

	public void write() {
		TreeSet<Animal> treeSet = new TreeSet<Animal>();
		treeSet.add(new Animal("猴子", 12, "公"));
		treeSet.add(new Animal("兔子", 3, "母"));
		treeSet.add(new Animal("鸵鸟", 5, "公"));
		treeSet.add(new Animal("狮子", 14, "母"));
		treeSet.add(new Animal("长颈鹿", 7, "公"));
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(treeSet);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void read() {
		TreeSet<Animal> treeSet = new TreeSet<Animal>();
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			treeSet = (TreeSet<Animal>) objectInputStream.readObject();
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
		for (Animal animal : treeSet) {
			System.out.println(animal);
		}
	}
}
