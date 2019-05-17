package HomeWork1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	FileInputStream fileInputStream = null;
	FileOutputStream fileOutputStream = null;

	public void copya(File o1, File o2) {
		File[] listFiles = o1.listFiles();
		if (!o2.exists()) {
			o2.mkdirs();
		}
		for (File file : listFiles) {
			File file1 = new File(o2, file.getName());
			if (file.isDirectory()) {
				copya(file, file1);
			} else {
				try {
					fileInputStream = new FileInputStream(file);
					fileOutputStream = new FileOutputStream(file1);
					byte[] by = new byte[1024 * 1024 * 8];
					int index = -1;
					while ((index = fileInputStream.read(by)) != -1) {
						fileOutputStream.write(by, 0, index);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
