package hk3;

import java.io.File;
import java.io.IOException;

/*
 * 4.����File�����d:\data\test.txt,��������ļ��Ƿ���ڣ�
 * �����򴴽�(Ŀ¼�粻�����Ƚ�Ŀ¼),��ӡ���Ķ���д��ִ��Ȩ��
 */
public class Hk3 {
	public static void main(String[] args) {
		File file = new File("d:\\data\\test.txt");
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			try {
				file.createNewFile();
				System.out.println(file.canExecute());
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
