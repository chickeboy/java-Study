package hk2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * ͨ�����봴��һ���ļ�a.txt
Ȼ��дһ������������̨ѭ���������ݣ�Ȼ��ͨ��gbk�ı����ʽ���浽
a.txt�У�Ҫ�����׷�ӣ���ֱ������exit����
��дһ��������Ҫ�����ַ���������ȡa.txt�е����ݵ�����̨��ӡ����
 */
public class Hk2 {
	public static void main(String[] args) {
		File file = new File("a.txt");
		new Util(file).input();
	}
}

class Util {
	private File file;

	public Util(File file) {
		super();
		this.file = file;
	}

	public void input() {
		try {
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
			BufferedWriter bw = new BufferedWriter(osw);
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("������");
				String line = scanner.next();
				if (line.equals("exit")) {
					break;
				}
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
