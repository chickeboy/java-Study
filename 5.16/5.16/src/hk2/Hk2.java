package hk2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * ��дһ��������ʾ�û�����һ���ļ���������·������
 * Ȼ��ȥ��������ļ�����ͳ���ļ���ÿ���ַ����ֵ�Ƶ�ʡ�
 */
public class Hk2 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		File file = new File("1.txt");// ���·������ǰ������
		System.out.println("������һ��·��");
		String str = scanner.next();
		if (str.equals(file.getAbsolutePath())) {
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			int len = -1;
			FileInputStream fis = new FileInputStream(file);
			while ((len = fis.read()) != -1) {
				char c = (char) len;
				if (hm.containsKey(c)) {
					hm.put(c, hm.get(c) + 1);
				} else {
					hm.put(c, 1);
				}
			}
			Set<Entry<Character, Integer>> entrySet = hm.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		} else {
			System.out.println("��������ȷ��·����" + file.getAbsolutePath());
		}

	}
}
