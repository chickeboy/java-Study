package tk1;

import java.io.File;

public class Tk2 {
	public static void main(String[] args) {
		File o1 = new File("D:\\javawork\\5.14");
		File o2 = new File("E:\\a");
		CopyUtil copyUtil = new CopyUtil();
		copyUtil.copy(o1, o2);
		
	}
}
class CopyUtil{
	public void copy(File file,File file2) {
		File[] listFiles = file.listFiles();
		for (File file3 : listFiles) {
			File file4 = new File(file2,file3.getName());
			System.out.println(file4);
			if (file3.isDirectory()) {
				copy(file3, file4);
			}
		}
	}
}