package hk3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

/*
 * ���ı��ļ��д���쳲��������У�
 * 1,1,2,3,5,8,13,21,34,55����ȡ��12����
 */
public class Hk3 {
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		String[] arr = line.split(",");
		System.out.println(arr[11]);

	}
}
