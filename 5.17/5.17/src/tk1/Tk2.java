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
 * ѭ��ʹ�ö�����������󣬲������ȡ�����
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
		// ȡ��
		// ����������û���ṩ�ж��Ƿ��ļ�ĩβ�ķ���
		// ��������֧��׷��
		// ���������ü��ϻ�������װ�ã�Ȼ�󽫼��ϻ������鿴��Ϊ��һ��
		// ����ֱ�Ӱ��������뵽�ı���
		// ��β�����һ��null��Ϊ�Լ��ж�β���ķ�ʽ(����ʹ������)
		// д���Ĺ��̽����л�����ȡ�Ĺ��̽з����л�(���ֽڱ�ɶ���)
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
