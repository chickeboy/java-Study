package HomeWork4;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	public void  modification (File file) {
		if (file.exists()) {
			file.setExecutable(true);
			file.setReadable(true);//���ÿɶ�Ȩ��
			file.setWritable(true);//���ÿ�дȨ��
			System.out.println("is execute allow : " + file.canExecute());
			System.out.println("is read allow : " + file.canRead());
			System.out.println("is write allow : " + file.canWrite());
		}else {	
			File file2 = new File(file.getParent());
			try {
			if (!file2.exists()) {
				file2.mkdirs();
				file.createNewFile();
			}else {
				file.createNewFile();
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
