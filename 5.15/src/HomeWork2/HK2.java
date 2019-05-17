package HomeWork2;

import java.io.File;

/*输出一个文件夹中的所有内容,使用File和递归函数来实现*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion recursion = new Recursion();
		File file = new File("D:\\javawork\\5.15");
		recursion.show(file);
	}

}
