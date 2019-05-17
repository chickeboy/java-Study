package TK1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

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

	public ArrayList<Student> add() {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("score");
			int score = scanner.nextInt();
			arrayList.add(new Student(id, name, score));
			System.out.println("y/n");
			String string = scanner.next();
			if (string.equals("n")) {
				break;
			}
		}
		return arrayList;
	}
	public void write(ArrayList<Student> arrayList) {
		try {
			fileOutputStream = new FileOutputStream(file);
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

	public ArrayList<Student> read() {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			arrayList = (ArrayList<Student>) objectInputStream.readObject();
			for (Student student : arrayList) {
				System.out.println(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			write(arrayList);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}
}
