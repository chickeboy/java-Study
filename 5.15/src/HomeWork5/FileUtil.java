package HomeWork5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	FileInputStream fileInputStream = null;
	FileOutputStream fileOutputStream = null;
	public void show(File o1,File o2) {
		try {
			fileInputStream = new FileInputStream(o1);
			fileOutputStream = new FileOutputStream(o2);
			byte[] by = new byte[1024*1024*8];
			int index = -1;
			while ((index = fileInputStream.read(by))!=-1) {
				fileOutputStream.write(by);
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
