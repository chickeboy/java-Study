package tk2;

import java.io.File;
import java.io.IOException;

/*
 * ����һ���ļ��������е����ļ�������
 * ʹ�õݹ� �����Լ������Լ�
 */
public class Tk3 {
	public static void main(String[] args) {
		new FileUtil().show(new File("D:\\BaiduNetdiskDownload"));
	}
}

class FileUtil {
	public void show(File file) {// d://a
		File[] listFiles = file.listFiles();// �Ȼ�ȡ��һ���ļ��������е�File����
		for (File f : listFiles) {// ������ǰ���ж���
			if (f.isDirectory()) {
				System.out.println("�ļ���" + f.getAbsolutePath());
				show(f);
			} else {
				System.out.println("�ļ�:" + f.getAbsolutePath());
			}
		}
	}
}
