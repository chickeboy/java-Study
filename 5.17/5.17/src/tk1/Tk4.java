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
 * ���������õĲ�����ʽ
 * 1.�������� ��ȡ�ļ� �����һ�δ򿪳���Ҳ��Ҫ�ȶ�
 * 2.Ȼ���ٳ������ڴ�����ҵ���߼��Ĳ��� �� ɾ �� ��
 * 3.������ϣ����������ϴ��뵽Դ�ļ��У�����ԭ������
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
			al.add(a);// �Ȱ����ݴ��뵽�ڴ漯����
		}
		// ֱ�Ӱ������ӽ��ļ���
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
			al = (ArrayList<A>) ois.readObject();// ��ȡ����
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
