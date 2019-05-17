package tk3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * I / O ��
 * ��:�����������ţ�����ȷʵ���ڵĶ���
 * ����������õĻ���ͨ��
 * �Է����Ͽ��Է�Ϊ����������
 * �����������Ϸ�Ϊ �ֽ������ַ���
 * �ֽ�������������������Դ����κ����͵�����
 * ͨ���ֽڵ���ʽ����
 * InputStream  �˳������Ǳ�ʾ�ֽ���������������ĳ��ࡣ
 * OutputStream �˳������Ǳ�ʾ�ֽ��������������ĳ���
 */
public class Tk3 {
	public static void main(String[] args) {
		File fi = new File("d:\\a\\1.mp4");
		File fo = new File("d:\\a\\2.mp4");
		FileUtil fileUtil = new FileUtil();
		fileUtil.copyB(fi, fo);
	}
}

class FileUtil {
	// fi Դ�ļ� fo Ŀ���ļ� ��ԭʼ�ĸ��ƹ���
	// �����Ǵ�ͷ��ʼ���ƣ���ʵ�����ļ�ͷ
	public void copyA(File fi, File fo) {
		// 1.��ȡԴ�ļ��������������ļ���ɢ���ֽڴ����ڴ���
		FileInputStream fis = null;
		// 2.��ȡĿ���ļ�������·���������
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fi);
			// fos = new FileOutputStream(fo, true);
			// true��ʾ���Ƶ�Ŀ���ļ��Ǵ�Ŀ���ļ���
			// ĩβ��ʼ����
			fos = new FileOutputStream(fo);
			// ѭ����ȡ�ļ��е��ֽ�
			int len = -1;// ÿ��������������ռ��С
			while ((len = fis.read()) != -1) {// ����-1��ʾ�����ļ�ĩβ
				// �߶���д ��һ�� д һ��
				System.out.print((char) len);
				fos.write(len);// ����������д��ȥ
			}
			fis.close();
			fos.close();// �ر�ͨ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	// �����ֽ�����Ч�� �ֶ�����һ��������
	public void copyB(File fi, File fo) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fi);
			fos = new FileOutputStream(fo);
			byte[] bt = new byte[1024 * 1024 * 8];// 1kb
			// System.out.println(bt.length);
			int len = -1;
			while ((len = fis.read(bt)) != -1) {
				// һ���Զ�����������Ȼ��һ����д���������ļ�
				System.out.println(len);
				fos.write(bt, 0, len);
				// �ֽ����Ļ���������Ҫ�ֶ�֪ͨ
			}
//			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
