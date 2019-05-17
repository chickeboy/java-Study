package hk4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 获取一个文件夹下所有指定后缀名(.java)的文件
 * （包括子文件夹中的内容），
 * 并将这些文件的绝对路径写入到一个文本文件中
 */
public class Hk4 {
	public static void main(String[] args) {
		File file = new File("D:\\工作\\java_work");
		new Util().open(file);
	}
}

class Util {
	public void open(File file) {
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			if (f.isFile()) {
				if (f.getName().endsWith(".java")) {
					String name = f.getAbsolutePath();
					wirte(name);
				}
			} else {
				open(f);
			}
		}

	}

	public void wirte(String line) {
		try {
			FileWriter fw = new FileWriter(new File("a.txt"), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(line);
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
