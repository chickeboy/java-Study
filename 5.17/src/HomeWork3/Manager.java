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
		treeSet.add(new Animal("����", 12, "��"));
		treeSet.add(new Animal("����", 3, "ĸ"));
		treeSet.add(new Animal("����", 5, "��"));
		treeSet.add(new Animal("ʨ��", 14, "ĸ"));
		treeSet.add(new Animal("����¹", 7, "��"));
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
