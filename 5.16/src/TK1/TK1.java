package TK1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File o1 = new File("D:\\a\\Test.java");
		File o2 = new File("D:\\a\\Test1.java");
		FileUtil fileUtil = new FileUtil();
		fileUtil.util(o1, o2);
	}

}
class FileUtil{
	public  void util(File o1,File o2) {
		FileReader fileReader;
		FileWriter fileWriter;
		try {
			fileReader = new FileReader(o1);
			fileWriter = new FileWriter(o2);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String str = null;
			while ((str = bufferedReader.readLine())!=null) {
				bufferedWriter.write(str);
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
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