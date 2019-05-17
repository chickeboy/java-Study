package Hk5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * �ô���ʵ�ִ����ļ���iotek,iotek�д�һ���ļ���iotekson,
 * ��iotekson�д���2���ļ�1.txt��2.txt��
 * Ҫ��1.txt�е������ɼ����������Ϣ������
 * ������Ϻ�ֵ���ݵ�2.txt�У���ȡ2.txt�����ӡ��
2)����iotek�ļ������������ݵ�����һ�����У�
����һ���µ��ļ���newiotek,���������ʾ��.....������ϡ�
3)Ҫ���벶������п��ܳ��ֵĸ����쳣��
 */
public class Hk5 {
	public static void main(String[] args) {
		File file = new File("d:\\iotek\\iotekson");
		Util util = new Util(file);
		util.init();
		util.input();

	}
}

class Util {
	private File file;
	private File f1;
	private File f2;

	public Util(File file) {
		super();
		this.file = file;
	}

	// �����ļ���
	public void init() {
		file.mkdirs();
		f1 = new File(file.getAbsoluteFile() + "\\1.txt");
		try {
			file.createNewFile();
			f2 = new File(file.getAbsoluteFile() + "\\2.txt");
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copyAll(File f1, File f2) throws IOException {
		f2.mkdirs();// ����Ŀ���ļ���
		File[] listFiles = f1.listFiles();// ��ȡһ���µ����� File����
		for (File file : listFiles) {
			// "D:\���� + \\ + Hk1.java
			// "E:\����+ \\ + Hk1.java
			// "D:\���� \HK E:\\���� + \\ +HK
			if (file.isFile()) {
				FileInputStream fis = new FileInputStream(file);// Դ�ļ�
				FileOutputStream fos = new FileOutputStream(f2.getAbsoluteFile() + "\\" + file.getName());// �����
				int len = -1;
				byte[] bt = new byte[8 * 1024 * 1024];
				while ((len = fis.read(bt)) != -1) {
					fos.write(bt, 0, len);
				}
				System.out.println("........�������");
				fis.close();
				fos.close();
			} else {
				copyAll(file, new File(f2.getAbsoluteFile() + "\\" + file.getName()));
			}
		}
	}

	public void input() {
		write(f1);
		copy(f1, f2);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f2));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			File newFile = new File("e:\\newiotek");
			copyAll(file.getParentFile(), newFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copy(File f1, File f2) {
		BufferedReader br = null;// �����ַ�������
		BufferedWriter bw = null;// �����ַ������
		// ʹ�û�����һ��Ҫ�л������ַ��� FileReader
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			br = new BufferedReader(fr);// �������ַ���װ����װ���ȡ��ǿ�Ĺ���
			bw = new BufferedWriter(fw);
			String line = null;
			// һ��ѭ����ȡһ�����ı�
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);// һ����д�룬��������
				bw.newLine();// ����
			}
			bw.flush();
			br.close();
			bw.close();
			// ���ﲻ��Ҫ��4����������������Ϳ�����
			// �������Դ�������������Ҫ�����ֶ�����������
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void write(File file) {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			Scanner scanner = new Scanner(System.in);
			System.out.println("������");
			String line = scanner.next();
			bw.write(line);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}