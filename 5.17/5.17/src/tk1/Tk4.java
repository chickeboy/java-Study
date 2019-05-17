package tk1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 对象流常用的操作方式
 * 1.创建集合 读取文件 就算第一次打开程序也是要先读
 * 2.然后再程序中内存里做业务逻辑的操作 增 删 改 查
 * 3.操作完毕，把整个集合存入到源文件中，覆盖原有数据
 */
public class Tk4 {
	public static void main(String[] args) {
		File file = new File("d:\\oo.txt");
		Util util = new Util(file);
		ArrayList<A> al = new ArrayList<A>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("score");
			double score = scanner.nextDouble();
			A a = new A(id, name, score);
			al.add(a);// 先把数据存入到内存集合中
		}
		// 直接把容器扔进文件中
		util.write(al);
		ArrayList<A> read = util.read();
		for (A a : read) {
			System.out.println(a);
		}

	}
}

class Util {
	private File file;
	private FileInputStream fis;
	private ObjectInputStream ois;
	private FileOutputStream fos;
	private ObjectOutputStream oos;

	public Util(File file) {
		super();
		this.file = file;
	}

	public ArrayList<A> read() {
		ArrayList<A> al = new ArrayList<A>();
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			al = (ArrayList<A>) ois.readObject();// 读取对象
		} catch (IOException e) {
			write(al);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}

	public void write(ArrayList<A> al) {
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
