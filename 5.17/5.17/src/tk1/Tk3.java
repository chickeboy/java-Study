package tk1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tk3 {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\obj.txt");
		File f2 = new File("d:\\xxxx.txt");
		FileReader fileReader = new FileReader(file);
		FileWriter fw = new FileWriter(f2);
		int len = -1;
		while ((len = fileReader.read()) != -1) {
			fw.write(len);
			fw.flush();
		}
	}
}
