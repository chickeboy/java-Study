package tk1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ���:ר�������������ı��ļ���IO��,������ֽ���
 * ���ܱȽϾ���, �Դ�һ��ת���һ��������,����ʶ������
 *Reader	�ַ��������ĸ���
 *Writer	�ַ�������ĸ���
 *FileReader
 *FileWriter
 * 
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		//
		File f1 = new File("d:\\1.txt");
		File f2 = new File("d:\\2.txt");
		// new Util().copyA(f1, f2);
		new Util().copyB(f1, f2);

	}
}

class Util {
	public void copyA(File f1, File f2) {
		// 1.��ȡԴ�ļ��������������;
		FileReader fr = null;
		FileWriter fw = null;
		// 2.��ֵ
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			int len = -1;
			while ((len = fr.read()) != -1) {
				System.out.print((char) len);// �����len������ÿ������
				// ��unicode�룬����ת��������
				fw.write(len);// �ַ���������һ��ת��Ļ�����
				// ��Ҫ���ѻ����ڶ�������д��ȥ
				// ������װ���Ķ�����ǿ��д��ȥ�����Ƕ������ô����
				// ��ͣ���ڻ���������
			}
			fw.flush();// ��ջ�����(�ڴ��еĶ��������ͷ�)
			fr.close();// close����flush����
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �ַ����Ļ���������Ч��
	public void copyB(File f1, File f2) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2, true);
			char[] ct = new char[1024 * 8];// 1024���ַ�
			int len = -1;
			while ((len = fr.read(ct)) != -1) {
				// System.out.println(len);// len������˶��ٸ��ַ�
				fw.write(ct, 0, len);
			}
			fw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
