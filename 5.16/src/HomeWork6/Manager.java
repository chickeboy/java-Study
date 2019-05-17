package HomeWork6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
	FileReader fileReader;
	FileWriter fileWriter;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	public void add(File o1,File o2) {
		try {
			fileReader = new FileReader(o1);
			fileWriter = new FileWriter(o2,true);
			bufferedReader = new BufferedReader(fileReader);
			bufferedWriter = new BufferedWriter(fileWriter);
			String str = null;
			while ((str=bufferedReader.readLine())!=null) {
				bufferedWriter.write(str);
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
