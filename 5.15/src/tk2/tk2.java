package tk2;

import java.io.File;
import java.io.FileFilter;

public class tk2 {
	public static void main(String[] args) {
		File file = new File("D:\\javawork\\5.15");
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				System.out.println(file2);
			}
		}
		File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {	
				return pathname.getName().endsWith("a");
			}
		});
		for (File file2 : listFiles) {
			if (file2.getName().endsWith("a")) {
				file2.delete();
			}
		}
	}
}
