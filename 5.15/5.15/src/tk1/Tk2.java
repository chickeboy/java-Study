package tk1;

import java.io.File;
import java.io.FileFilter;

/*
 * ��ȡĳһ���ļ���·���µ�����File����
 * 
 * 1.��������һ���ļ�·������Ҫ��㼶��Ȼ���ж��Ƿ񴴽��ɹ�
 * ������ɹ������д�������������ļ��Ĵ���
 * 2.��ȡһ���ļ��е�File���󣬻�ȡ�ö���·���µ������ļ������ļ���
 * ����Ȼ�������������������ʱ��������һ����׺����Ȼ��ɾ��
 * ���Ϻ�׺����Ϣ���ļ�
 */
public class Tk2 {
	public static void main(String[] args) {
		File file = new File("F:\\Mysql");// δ֪�����ļ������ļ���
		if (file.isDirectory()) {// �Ƿ����ļ���
			// file.isFile()�Ƿ����ļ�
			File[] listFiles = file.listFiles();
			// ������һ���ļ����µ�����File����װ��������
			for (File f : listFiles) {
				System.out.println(f.getAbsolutePath());
			}
		} else {
			System.out.println("�����ļ�");
		}
		File[] listFiles = file.listFiles(new FileFilter() {
			// �ڷ��������ʱ����һ����������ʵ�������
			// ����ֵ���ص�������Ҫװ�������File����
			// accept����ֵΪtrue�������������Ҫ��
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".exe");
			}
		});
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}

	}
}
