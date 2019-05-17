package HomeWork4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
	File file;
	FileReader fileReader;
	FileWriter fileWriter;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;

	public Manager(File file) {
		super();
		this.file = file;
	}

	public void addFiles(File file) {
		File[] listFiles = file.listFiles();
		for (File file1 : listFiles) {
			if (file1.isDirectory()) {
				addFiles(file1);
			} else {
				String name = file1.getName();
				String fileTyle = name.substring(name.lastIndexOf("."), name.length());
				if (fileTyle.equals(".java")) {
					try {
						String string = file1.toString();
						fileWriter = new FileWriter(this.file,true);
						bufferedWriter = new BufferedWriter(fileWriter);
						bufferedWriter.write(string);
						bufferedWriter.newLine();
						bufferedWriter.flush();
						System.out.println("1");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
