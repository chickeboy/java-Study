package HomeWork2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*通过代码创建一个文件a.txt
然后写一个方法，控制台循环输入内容，然后通过gbk的编码格式保存到
a.txt中（要求可以追加），直到输入exit结束*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\a.txt");
		if (!file.exists()) {

			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file, true);
				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
				BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
				while (true) {
					System.out.println("请输入");
					String lin = bufferedReader.readLine();
					if (lin.equals("exit")) {
						break;
					} else {
						bufferedWriter.write(lin);
						bufferedWriter.newLine();
						bufferedWriter.flush();
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				inputStreamReader = new InputStreamReader(fileInputStream);
				BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
				String str = null;
				while ((str = bufferedReader2.readLine()) != null) {
					System.out.println(str);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}