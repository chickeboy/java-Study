package HomeWork5;

import java.io.File;
/*1)�ô���ʵ�ִ����ļ���iotek,iotek�д�һ���ļ���iotekson,��iotekson�д���2���ļ�1.txt��2.txt��
 * Ҫ��1.txt�е������ɼ����������Ϣ������������Ϻ�ֵ���ݵ�2.txt�У���ȡ2.txt�����ӡ��
2)����iotek�ļ������������ݵ�����һ�����У�����һ���µ��ļ���newiotek,���������ʾ��.....������ϡ�
3)Ҫ���벶������п��ܳ��ֵĸ����쳣��*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\iotek");
		File file1 = new File("D:\\a\\iotek\\1.txt");
		File file2 = new File("D:\\a\\iotek\\2.txt");
		File file3 = new File("E:\\a\\newiotek");
		Mnaager manager = new Mnaager(file, file1, file2);
		manager.folder();
		manager.file();
		manager.add();
		manager.copy();
		manager.copyA(file, file3);
	}

}
