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
 * ������:����ķ�ʽ��ͨ���������ʽ
 * ������һ���ֽ����İ�װ��
 * ����ķ�ʽ�Ƕ���������ȡ�ķ�ʽҲ�����Ƕ�����
 * 
 */
public class Tk1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ʹ�ö����������ݴ��뵽�ı���
		// 1.����һ���������ֽ���
		File file = new File("d:\\obj.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// ���д�Ĺ���
		// java.io.NotSerializableException ʹ�ö������Ĵ���Ķ��󶼱���ʵ��
		// ����ӿ�,Serializable�����л��ӿڣ����������ɢ���ֽ�
		A a = new A(3, "xx", 3);
		oos.writeObject(a);// д������
		// �������ʽ�Ƕ���������ģ�ֻ��ͨ��������ȡ�����ܲ鿴
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		// Object object = ois.readObject();
		A aa = (A) ois.readObject();
		System.out.println(aa);

	}
}

//һ��Ҫ����
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
