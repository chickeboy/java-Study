package ketang;

import java.util.Arrays;

/*��һ�������100���μ�ѡ���֣����Ϊ1-100��Ҫ����10�����˶�����Щ�˵ı����3�ı�������ӡ����Щѡ�ֵı�ţ�Ҫ���ܳ����ظ�ѡ�֡�*/
public class TK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output(luckydraw());
	}

	private static int[] luckydraw() {
		int index = 1;
		int a = 0;
		int array[] = new int[10];
		while (a < 10) {
			array[a] = (int) Math.floor(Math.random() * 99+1);
			index = 1;
			if (a > 0) {
				for (int i = 0; i < a; i++) {
					if (array[a] == array[i]) {
						index = -1;
						break;
					}
				}
			}
			if (array[a] % 3 == 0 && index == 1) {
				a++;
			}
		}
		return array;
	}

	public static void output(int array[]) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
