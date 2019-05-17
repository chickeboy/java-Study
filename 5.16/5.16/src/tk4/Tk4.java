package tk4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Scanner;

/*
 * 转换流:将字节流转换成字符流
 * 在编写一个方法的时候默认使用字节流
 * 但是呢你可以通过转换流将这个字节流转换成字符流
 * 达到自己的目的(操作纯文本文件的时候)
 * InputStreamReader 转换输入流
 * OutputStreamWriter
 * 转换流只有在使用别人东西的时候别人只给你字节流
 * 然而你发现字节流是用不方方便，需要使用字符流的
 * 时候才会使用转换流
 * 转换流:只有特殊情况才会使用(只能获取字节流,需要转换编码格式)
 */
public class Tk4 {
	public static void main(String[] args) throws IOException {
		// System.in字节输入流
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		File file = new File("d:\\5.txt");
		System.out.println(isr.getEncoding());
		// 转换流最大的功能就是可以转码
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
		// FileOutputStream(file, true), "UTF-8"));
		FileOutputStream fos = new FileOutputStream(file, true);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		System.out.println(osw.getEncoding());
		BufferedWriter bw = new BufferedWriter(osw);
		// BufferedReader(isr)放Reader的子类
		while (true) {
			System.out.println("请输入");
			try {
				String line = br.readLine();
				if (line.equals("over")) {
					break;
				}
				bw.write(line);
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
