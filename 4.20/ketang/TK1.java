package ketang;

import java.util.Arrays;

/*有一个活动，有100名参加选手手，编号为1-100，要求抽出10名幸运儿，这些人的编号是3的倍数，打印出这些选手的编号，要求不能出现重复选手。*/
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
