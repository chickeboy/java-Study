package HomeWork1;

import java.io.File;

/*将一个文件夹中的内容复制到其它目录中。
 *（比如:把D:\\chenhao中的内容复制一份到 e:\\zhangsan文件夹中）
(递归和通过字节流来进行复制FileInputStream和FileOutputStream)*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File o1 = new File("D:\\javawork\\5.14");
		File o2 = new File("E:\\a");
		FileUtil fileUtil = new FileUtil();
		fileUtil.copya(o1, o2);
	}

}
