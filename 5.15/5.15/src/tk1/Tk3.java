package tk1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 *  1.��������һ���ļ�·������Ҫ��㼶��Ȼ���ж��Ƿ񴴽��ɹ�
 * ������ɹ������д�������������ļ��Ĵ���
 * 2.��ȡһ���ļ��е�File���󣬻�ȡ�ö���·���µ������ļ������ļ���
 * ����Ȼ�������������������ʱ��������һ����׺����Ȼ��ɾ��
 * ���Ϻ�׺����Ϣ���ļ�
 */
public class Tk3 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("������һ��·��");
			String str = scanner.next();
			File file = new File("D:\\\\javawork\\\\5.14");
			if (file.exists()) {
				System.out.println("���ļ��Ѿ�����");
				break;
			}
			// �ж��ļ��Ƿ�����Ƿ�����ʵ��
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("���ȴ����ļ���");
				File f = file.getParentFile();// ֱ�ӻ�ȡ��·��
				f.mkdirs();
				file.createNewFile();
				// ���������·�������������ʵ���ڵ�
			}
		}
	}
}
