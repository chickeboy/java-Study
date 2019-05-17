package HomeWork2;

import java.io.File;

public class Recursion {
	public void show(File file) {
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			if (file2.isDirectory()) {
				System.out.println("文件夹" + file2.getAbsolutePath());
				show(file2);
			}else {
				System.out.println("文件"+file2.getAbsolutePath());
			}
		}
	}
}
