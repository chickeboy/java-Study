package tk2;

import java.util.Arrays;
import java.util.Comparator;

public class Tk6 {
	public static void main(String[] args) {
		String[] array = { "ff", "xx", "ccc" };
		CompareByLength byLength = new CompareByLength();
		Arrays.sort(array, new CompareByLength());
		Arrays.sort(array, new Comparator<String>() {
			/*
			 * �ӿڱ����ǲ���ʵ�����ģ���������ʵ�������new ��ʵ���û�����ֵ�������ǽӿڵ�ʵ���࣬��ʱд��һ��ʵ���� û�����ֶ���
			 */
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		// �����Ƿ����еĶ���ֻ��һ�Σ����ó�������
	}
}

class CompareByLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
