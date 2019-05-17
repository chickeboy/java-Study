package HomeWork3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtil {
	public void show(File file) {
		int a = 0;
		int index = -1;
		for (int i = 'a'; i <= 'z'; i++) {
			int count = 0;
			try {
				FileInputStream fileInputStream = new FileInputStream(file);

				while ((index = fileInputStream.read()) != -1) {

					if (index == i) {
						count++;
						a=index;
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (count != 0) {
				System.out.println((char)a + "出现了" + count + "次");
			}
		}

	}
}
