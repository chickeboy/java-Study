package hk4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��ȡһ���ļ���������ָ����׺��(.java)���ļ�
 * ���������ļ����е����ݣ���
 * ������Щ�ļ��ľ���·��д�뵽һ���ı��ļ���
 */
public class Hk4 {
	public static void main(String[] args) {
		File file = new File("D:\\����\\java_work");
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
