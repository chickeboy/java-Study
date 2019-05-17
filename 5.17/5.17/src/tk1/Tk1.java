package tk1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 对象流:存入的方式是通过对象的形式
 * 本身是一个字节流的包装类
 * 存入的方式是对象流，提取的方式也必须是对象流
 * 
 */
public class Tk1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 使用对象流将内容存入到文本中
		// 1.创建一个基础的字节流
		File file = new File("d:\\obj.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 完成写的过程
		// java.io.NotSerializableException 使用对象流的存入的对象都必须实现
		// 这个接口,Serializable是序列化接口，允许将对象打散成字节
		A a = new A(3, "xx", 3);
		oos.writeObject(a);// 写出对象
		// 存入的形式是二进制乱码的，只有通过对象流取出才能查看
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		// Object object = ois.readObject();
		A aa = (A) ois.readObject();
		System.out.println(aa);

	}
}

//一定要盖章
class A implements Serializable {
	private int id;
	private String name;
	private double score;

	public A(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

}
