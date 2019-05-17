package tk3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * I / O 流
 * 流:看不见摸不着，但是确实存在的东西
 * 计算机的设置的缓存通道
 * 丛方向上可以分为输入和输出流
 * 丛数据类型上分为 字节流和字符流
 * 字节流：最基础的流，可以传输任何类型的数据
 * 通过字节的形式传递
 * InputStream  此抽象类是表示字节输入流的所有类的超类。
 * OutputStream 此抽象类是表示字节输出流的所有类的超类
 */
public class Tk3 {
	public static void main(String[] args) {
		File fi = new File("d:\\a\\1.mp4");
		File fo = new File("d:\\a\\2.mp4");
		FileUtil fileUtil = new FileUtil();
		fileUtil.copyB(fi, fo);
	}
}

class FileUtil {
	// fi 源文件 fo 目标文件 最原始的复制过程
	// 这里是从头开始复制，其实点在文件头
	public void copyA(File fi, File fo) {
		// 1.获取源文件的输入流，将文件打散成字节存入内存中
		FileInputStream fis = null;
		// 2.获取目标文件的虚拟路径的输出流
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fi);
			// fos = new FileOutputStream(fo, true);
			// true表示复制到目标文件是从目标文件的
			// 末尾开始复制
			fos = new FileOutputStream(fo);
			// 循环读取文件中的字节
			int len = -1;// 每次吸到的数据所占大小
			while ((len = fis.read()) != -1) {// 读到-1表示读到文件末尾
				// 边读编写 读一个 写 一个
				System.out.print((char) len);
				fos.write(len);// 读到的数据写出去
			}
			fis.close();
			fos.close();// 关闭通道
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	// 提升字节流的效率 手动创建一个缓冲区
	public void copyB(File fi, File fo) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fi);
			fos = new FileOutputStream(fo);
			byte[] bt = new byte[1024 * 1024 * 8];// 1kb
			// System.out.println(bt.length);
			int len = -1;
			while ((len = fis.read(bt)) != -1) {
				// 一次性读满缓冲区，然后一次性写出到本地文件
				System.out.println(len);
				fos.write(bt, 0, len);
				// 字节流的缓冲区不需要手动通知
			}
//			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
