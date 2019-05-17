package tk1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流:专门用来操作纯文本文件的IO流,相对于字节流
 * 功能比较局限, 自带一个转码的一个缓冲区,可以识别中文
 *Reader	字符输入流的父类
 *Writer	字符输出流的父类
 *FileReader
 *FileWriter
 * 
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		//
		File f1 = new File("d:\\1.txt");
		File f2 = new File("d:\\2.txt");
		// new Util().copyA(f1, f2);
		new Util().copyB(f1, f2);

	}
}

class Util {
	public void copyA(File f1, File f2) {
		// 1.获取源文件的输入流输出流;
		FileReader fr = null;
		FileWriter fw = null;
		// 2.赋值
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			int len = -1;
			while ((len = fr.read()) != -1) {
				System.out.print((char) len);// 这里的len读到的每个数据
				// 的unicode码，可以转换成中文
				fw.write(len);// 字符流本身有一个转码的缓冲区
				// 需要唤醒缓冲期东西可以写出去
				// 缓冲区装满的东西会强行写出去，但是多余的那么部分
				// 还停留在缓冲区当中
			}
			fw.flush();// 清空缓冲区(内存中的东西可以释放)
			fr.close();// close具有flush功能
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 字符流的缓冲区增加效率
	public void copyB(File f1, File f2) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2, true);
			char[] ct = new char[1024 * 8];// 1024个字符
			int len = -1;
			while ((len = fr.read(ct)) != -1) {
				// System.out.println(len);// len代表存了多少个字符
				fw.write(ct, 0, len);
			}
			fw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
