package tk2;

/*
 * ����һ���ļ��������е����ļ�������
 * ʹ�õݹ� �����Լ������Լ�
 * �������н�����һ������
 * 1 + 2 + 3 + ..... + 100
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		System.out.println(new Util().get(100));
		System.out.println(new Util().getFe(100));
	}
}

class Util {
	public int get(int num) {
		if (num == 1) {
			return 1;
		}
		int x = num + get(num - 1);
		System.out.println("num = " + num + " x = " + x);
		return x;
	}

	public int getFe(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}
		return getFe(num - 1) + getFe(num - 2);
		// 4 + 3
		//
	}
}
