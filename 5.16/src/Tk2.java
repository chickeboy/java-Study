package tk2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ����İ�װ��
 */
public class Tk2 {
	public static void main(String[] args) {
		File f1 = new File("d:\\1.txt");
		File f2 = new File("d:\\4.txt");
		new Util().copy(f1, f2);
	}
}

class Util {
	public void copy(File f1, File f2) {
		BufferedReader br = null;// �����ַ�������
		BufferedWriter bw = null;// �����ַ������
		// ʹ�û�����һ��Ҫ�л������ַ��� FileReader
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			br = new BufferedReader(fr);// �������ַ���װ����װ���ȡ��ǿ�Ĺ���
			bw = new BufferedWriter(fw);
			String line = null;
			// һ��ѭ����ȡһ�����ı�
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);// һ����д�룬��������
				bw.newLine();// ����
			}
			bw.flush();
			br.close();
			bw.close();
			// ���ﲻ��Ҫ��4����������������Ϳ�����
			// �������Դ�������������Ҫ�����ֶ�����������
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
