package HomeWork2;

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
	ArrayList<Student> arrayList;
	File file;
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;
	ObjectInputStream objectInputStream;
	ObjectOutputStream objectOutputStream;
	
	public Manager(ArrayList<Student> arrayList, File file) {
		super();
		this.arrayList = arrayList;
		this.file = file;
	}

	public ArrayList<Student> add() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("score");
			int score = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("address");
			String address = scanner.next();
			arrayList.add(new Student(id, score, name, address));
			System.out.println("y/n");
			String string = scanner.next();
			if (string.equals("n")) {
				break;
			}
		}
		return arrayList;	
	}
	public ArrayList<Student> remove() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id  = scanner.nextInt();
			Student student = new Student(id);
			if (arrayList.contains(student)) {
				arrayList.remove(arrayList.indexOf(student));
			}else {
				System.out.println("不存在");
			}
			System.out.println("y/n");
			String string = scanner.next();
			if (string.equals("n")) {
				break;
			}
		}
		return arrayList;
	}
	public ArrayList<Student> updata() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			Student student = new Student(id);
			if (arrayList.contains(student)) {
				int a = arrayList.indexOf(student);
				System.out.println("score");
				int score = scanner.nextInt();
				arrayList.get(a).setScore(score);
				System.out.println("name");
				String name = scanner.next();
				arrayList.get(a).setName(name);
				System.out.println("address");
				String address = scanner.next();
				arrayList.get(a).setAddress(address);
				System.out.println("y/n");
				String string = scanner.next();
				if (string.equals("n")) {
					break;
				}
			}else {
				System.out.println("不存在");
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
		ArrayList<Student> arrayList2 = new ArrayList<Student>();
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			arrayList2 = (ArrayList<Student>) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		write(arrayList2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList2;
	}
}
