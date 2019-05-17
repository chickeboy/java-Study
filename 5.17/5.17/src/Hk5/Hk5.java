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
 * 用代码实现创建文件夹iotek,iotek中创一个文件夹iotekson,
 * 在iotekson中创建2个文件1.txt和2.txt，
 * 要求1.txt中的内容由键盘输入的信息决定，
 * 输入完毕后赋值内容到2.txt中，读取2.txt输出打印。
2)复制iotek文件夹下所有内容到另外一个盘中，
生成一个新的文件夹newiotek,复制完毕提示”.....复制完毕”
3)要求请捕获程序中可能出现的各种异常。
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

	// 创建文件夹
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
		f2.mkdirs();// 创建目标文件夹
		File[] listFiles = f1.listFiles();// 获取一级下的所有 File对象
		for (File file : listFiles) {
			// "D:\工作 + \\ + Hk1.java
			// "E:\工作+ \\ + Hk1.java
			// "D:\工作 \HK E:\\工作 + \\ +HK
			if (file.isFile()) {
				FileInputStream fis = new FileInputStream(file);// 源文件
				FileOutputStream fos = new FileOutputStream(f2.getAbsoluteFile() + "\\" + file.getName());// 输出流
				int len = -1;
				byte[] bt = new byte[8 * 1024 * 1024];
				while ((len = fis.read(bt)) != -1) {
					fos.write(bt, 0, len);
				}
				System.out.println("........复制完毕");
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
		BufferedReader br = null;// 缓冲字符输入流
		BufferedWriter bw = null;// 缓冲字符输出流
		// 使用缓冲流一定要有基础的字符流 FileReader
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			br = new BufferedReader(fr);// 将基本字符流装进包装类获取更强的功能
			bw = new BufferedWriter(fw);
			String line = null;
			// 一次循环读取一整行文本
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);// 一整行写入，不带换行
				bw.newLine();// 换行
			}
			bw.flush();
			br.close();
			bw.close();
			// 这里不需要关4个流，关外面的流就可以了
			// 缓冲流自带缓冲区，不需要我们手动创建缓冲区
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
			System.out.println("请输入");
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