package HomeWork5;

import java.io.File;

/*����һ��MP3�ļ�
Ҫ�󣺽�D�̸�Ŀ¼�µ�src.mp3�ļ����Ƶ�ͬһĿ¼�²�����Ϊdes.mp3*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File o1 = new File("d:\\src.mp3");
		File o2 = new File("d:\\des.mp3");
		FileUtil fileUtil = new FileUtil();
		fileUtil.show(o1, o2);
	}
}
