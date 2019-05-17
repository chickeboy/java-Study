package hk1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * дһ������Ҫ���û�ֻ�ܴ�5�Σ�
 * �ڵ�6�δ򿪵�ʱ����׳��쳣��ʾ"��ʧ��"
 */
public class Hk1 {
	public static void main(String[] args) {
		File file = new File("d:\\a\\1.txt");
		new Open(file).open();
	}
}

class Open {
	File file;

	public Open(File file) {
		super();
		this.file = file;
	}

	public void open() {
		Util util = new Util(file);
		int res = 0;
		// d:
		if (!file.exists()) {// ��һ�δ�һ���ļ�
			try {
				res = 1;
				file.getParentFile().mkdirs();
				file.createNewFile();
				util.write(res);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			res = util.read();
			res += 1;
			if (res == 6) {
				throw new IndexOutOfBoundsException("��5��");
			}
			util.write(res);// ��ԭ��������ֵ���ǵ�
		}
		System.out.println("����......" + res);
	}
}

class Util {
	private File file;
	private FileReader fr;
	private FileWriter fw;
	private BufferedReader br;
	private BufferedWriter bw;

	public Util(File file) {
		super();
		this.file = file;
	}

	public int read() {
		int res = 0;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = br.readLine();
			res = Integer.parseInt(line);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	public void write(int res) {
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(res + "");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
