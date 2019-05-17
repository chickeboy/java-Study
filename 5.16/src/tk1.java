import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tk1 {
	public static void main(String[] args) {
		File o1 = new File("D:\\a\\Test.java");
		File o2 = new File("D:\\a\\Test1.java");
		FileUtil fileUtil = new FileUtil();
		fileUtil.copy(o1, o2);
		fileUtil.copyA(o1, o2);
	}
}

class FileUtil {
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;

	public void copy(File o1, File o2) {
		try {
			fileInputStream = new FileInputStream(o1);
			fileOutputStream = new FileOutputStream(o2);
			byte[] by = new byte[1024 * 1024 * 8];
			int index = -1;
			while ((index = fileInputStream.read(by)) != -1) {
				
				fileOutputStream.write(by, 0, index);
				System.out.println(index);
			}
			fileInputStream.close();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copyA(File o1, File o2) {
		try {
			FileReader fileReader = new FileReader(o1);
			FileWriter fileWriter = new FileWriter(o2);
			char[] ch = new char[1024 * 8];
			int index = -1;
			while ((index = fileReader.read(ch)) != -1) {
				for (char c : ch) {
					System.out.print((char) c);
				}
				fileWriter.write(ch, 0, index);
			}
			fileWriter.flush();
			fileReader.close();
			fileWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}