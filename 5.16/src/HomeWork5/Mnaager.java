package HomeWork5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Mnaager {
	File file;
	File file1;
	File file2;
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;
	InputStreamReader inputStreamReader;
	OutputStreamWriter outputStreamWriter;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;

	public Mnaager(File file, File file1, File file2) {
		super();
		this.file = file;
		this.file1 = file1;
		this.file2 = file2;
	}

	public void folder() {
		if (file.exists()) {
			System.out.println("此文件夹已经存在");
		} else {
			file.mkdirs();
		}
	}

	public void file() {
		try {
			if (file1.exists() && file2.exists()) {
				System.out.println("文件1文件2已经存在");
			} else if (!file1.exists()) {
				file1.createNewFile();
			} else if (!file2.exists()) {
				file2.createNewFile();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void add() {
		inputStreamReader = new InputStreamReader(System.in);
		bufferedReader = new BufferedReader(inputStreamReader);
		try {
			fileOutputStream = new FileOutputStream(file1, true);
			outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			while (true) {
				System.out.println("请输入");
				String str = bufferedReader.readLine();
				if (str.equals("exit")) {
					break;
				} else {
					bufferedWriter.write(str);
					bufferedWriter.newLine();
					bufferedWriter.flush();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void copy() {
		try {
			FileReader fileReader = new FileReader(file1);
			FileWriter fileWriter = new FileWriter(file2);
			bufferedReader = new BufferedReader(fileReader);
			bufferedWriter = new BufferedWriter(fileWriter);
			String str = null;
			while ((str=bufferedReader.readLine())!=null) {
				System.out.println(str);
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
	public void copyA(File o1,File o2) {
		File[] listFiles = o1.listFiles();
		if (!o2.exists()) {
			o2.mkdirs();
		}
		for (File file : listFiles) {
			File file1 = new File(o2, file.getName());
			if (file.isDirectory()) {
				copyA(file, file1);
			}else {
				try {
					FileReader fileReader = new FileReader(file);
					FileWriter fileWriter = new FileWriter(file1);
					bufferedReader = new BufferedReader(fileReader);
					bufferedWriter = new BufferedWriter(fileWriter);
					String str = null;
					while ((str = bufferedReader.readLine())!=null) {
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
		System.out.println("复制完毕");
	}
}
