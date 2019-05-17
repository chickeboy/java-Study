package TK;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tk{
	public static void main(String[] args) {
		File file = new File("D:\\a\\a.txt");
		File file2 = new File("D:\\a\\d.txt");
		Util util = new Util();
		util.util(file, file2);
				
	}
}
class Util{
	public void util(File o1,File o2) {
		try {
			FileReader fileReader = new FileReader(o1);
			FileWriter fileWriter = new FileWriter(o2);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String string = null;
			while ((string = bufferedReader.readLine())!=null) {
				bufferedWriter.write(string);
				bufferedWriter.newLine();
				bufferedWriter.flush();
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