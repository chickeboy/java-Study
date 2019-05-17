package tk1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileOutputStream;

/*
 * 
 * 循环使用对象流存入对象，并且最后取出输出
 */
public class Tk2 {
	public static void main(String[] args) {
		File file = new File("d:\\oo.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		Scanner scanner = new Scanner(System.in);
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			for (int i = 0; i < 3; i++) {
				System.out.println("id");
				int id = scanner.nextInt();
				System.out.println("name");
				String name = scanner.next();
				System.out.println("score");
				double score = scanner.nextDouble();
				A a = new A(id, name, score);
				oos.writeObject(a);
			}
			oos.writeObject(null);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 取出
		// 对象流本身没有提供判断是否到文件末尾的方法
		// 对象流不支持追加
		// 多条数据用集合或者数组装好，然后将集合或者数组看作为是一个
		// 对象直接把容器存入到文本中
		// 在尾部添加一个null作为自己判断尾部的方式(建议使用容器)
		// 写出的过程叫序列化，读取的过程叫反序列化(将字节变成对象)
		FileInputStream fis;
		file = new File("d:\\oo.txt");
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			A a = null;
			while ((a = (A) ois.readObject()) != null) {
				System.out.println(a);
			}
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
	}
}
