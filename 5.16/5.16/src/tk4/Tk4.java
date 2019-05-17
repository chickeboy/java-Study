package tk4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Scanner;

/*
 * ת����:���ֽ���ת�����ַ���
 * �ڱ�дһ��������ʱ��Ĭ��ʹ���ֽ���
 * �����������ͨ��ת����������ֽ���ת�����ַ���
 * �ﵽ�Լ���Ŀ��(�������ı��ļ���ʱ��)
 * InputStreamReader ת��������
 * OutputStreamWriter
 * ת����ֻ����ʹ�ñ��˶�����ʱ�����ֻ�����ֽ���
 * Ȼ���㷢���ֽ������ò������㣬��Ҫʹ���ַ�����
 * ʱ��Ż�ʹ��ת����
 * ת����:ֻ����������Ż�ʹ��(ֻ�ܻ�ȡ�ֽ���,��Ҫת�������ʽ)
 */
public class Tk4 {
	public static void main(String[] args) throws IOException {
		// System.in�ֽ�������
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		File file = new File("d:\\5.txt");
		System.out.println(isr.getEncoding());
		// ת�������Ĺ��ܾ��ǿ���ת��
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
		// FileOutputStream(file, true), "UTF-8"));
		FileOutputStream fos = new FileOutputStream(file, true);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		System.out.println(osw.getEncoding());
		BufferedWriter bw = new BufferedWriter(osw);
		// BufferedReader(isr)��Reader������
		while (true) {
			System.out.println("������");
			try {
				String line = br.readLine();
				if (line.equals("over")) {
					break;
				}
				bw.write(line);
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
