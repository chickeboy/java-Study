package HomeWork4;

import java.io.File;

/*��ȡһ���ļ���������ָ����׺��(.java)���ļ����������ļ����е����ݣ���������Щ�ļ��ľ���·��д�뵽һ���ı��ļ���*/
public class HK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\c.txt");
		Manager manager = new Manager(file);
		File file2 = new File("D:\\javawork\\5.15");
		manager.addFiles(file2);
	}
}
