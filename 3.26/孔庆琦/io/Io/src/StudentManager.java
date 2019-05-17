import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManager {
	private ArrayList<Student> al;
	private File f;

	public StudentManager() {
		// TODO Auto-generated constructor stub
		al = new ArrayList<>();
		f = new File("d://a.txt");
	}

	public void init() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("age");
			int age = scanner.nextInt();
			Student student = new Student(age, id, name);
			al.add(student);
			System.out.println("是否继续");
			String choose = scanner.next();
			if (choose.equals("n")) {
				break;
			}
		}
	}

	public void sort() {
		Collections.sort(al);
	}

	public void show() {
		for (Student student : al) {
			System.out.println(student);
		}
	}

	public void write() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(al);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 获取输出流
	}

	public void read() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			al = (ArrayList<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 输入流
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
