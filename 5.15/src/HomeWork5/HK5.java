package HomeWork5;

import java.io.File;

/*复制一个MP3文件
要求：将D盘根目录下的src.mp3文件复制到同一目录下并命名为des.mp3*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File o1 = new File("d:\\src.mp3");
		File o2 = new File("d:\\des.mp3");
		FileUtil fileUtil = new FileUtil();
		fileUtil.show(o1, o2);
	}
}
