package tk1;

import java.io.File;
import java.io.IOException;

/*
 * I O 
 * Input  OutPut
 *   �ڴ�.����	 �ڴ�.д��
 */
public class Tk1 {
	public static void main(String[] args) {
		// File �������ȡһ���ļ�·���Ķ������ڲ����ļ�
		File file = new File("d:\\a\\b\\c");//
		// pathname��һ������·�� �����Ǵ��ڵ�Ҳ�����ǲ����ڵ�
		System.out.println(file.getAbsolutePath());// ����·��
		System.out.println(file.getParent());
		// ֱ�ӴӸ�Ŀ¼��ʼ��һ������·��
		System.out.println(file.getName());// �ļ���
		// System.out.println(file.delete());// ɾ��
		System.out.println(file.mkdir());// �����ļ���
		// ֻ�ܴ���һ���ļ���,�ڸ�·����ʵ���ڵ������
		// ���ܴ���һ�����ļ���
		// ���������·�������ʵ·�� �����ļ�
		System.out.println(file.mkdirs());// ���Դ�����㼶�ļ���
		// �ļ��Ĵ���
		File file2 = new File("d:\\a\\b\\c\\1.txt");
		// ����·���ǲ��������ļ������ļ��е�
		try {
			System.out.println(file2.createNewFile());
			// �����ļ���·��������ʵ���ڵ�
		} catch (IOException e) {
			e.printStackTrace();
		} // �������ļ���
	}
}
