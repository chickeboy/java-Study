package hk2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 通过代码创建一个文件a.txt
然后写一个方法，控制台循环输入内容，然后通过gbk的编码格式保存到
a.txt中（要求可以追加），直到输入exit结束
再写一个方法，要求用字符缓冲流读取a.txt中的内容到控制台打印出来
 */
public class Hk2 {
	public static void main(String[] args) {
		File file = new File("a.txt");
		new Util(file).input();
	}
}

class Util {
	private File file;

	public Util(File file) {
		super();
		this.file = file;
	}

	public void input() {
		try {
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
			BufferedWriter bw = new BufferedWriter(osw);
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("请输入");
				String line = scanner.next();
				if (line.equals("exit")) {
					break;
				}
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
