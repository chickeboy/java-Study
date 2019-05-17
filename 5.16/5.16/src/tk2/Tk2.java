package tk2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流的包装类
 */
public class Tk2 {
	public static void main(String[] args) {
		File f1 = new File("d:\\1.txt");
		File f2 = new File("d:\\4.txt");
		new Util().copy(f1, f2);
	}
}

class Util {
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
}
