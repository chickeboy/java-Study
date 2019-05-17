package HomeWork1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*1.写一个程序，要求用户只能打开5次，在第6次打开的时候就抛出异常提示“打开失败”。*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\1.txt");
		Program program  = new Program(file);
		int i = '0';
		while (true) {
			program.write(i);
			try {
				i  =program.read();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				break;
			}
		}
	}

}
class Program{
	File file;
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;
	
	public Program( File file) {
		super();
		this.file = file;
	}
	public void write(int i) {
		System.out.println((char)i);
		try {
		fileOutputStream  = new FileOutputStream(file);
		fileOutputStream.write(++i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int read() throws Exception {
		int index = -1;
		int count = 0;
		try {
			fileInputStream = new FileInputStream(file);
			while ((index = fileInputStream.read())!=-1) {
				if (index<'6') {
					System.out.println("打开成功");
					count = index;
				}else {
					throw new Exception("打开失败");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
		return count;
	}
}