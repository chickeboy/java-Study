package tk2;

import java.util.Random;

public class Tk4 {
	public static void main(String[] args) {
		int[] array = getArray();// 获取33个人
		array = getGoodLuck(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static int[] getArray() {
		int[] array = new int[33];
		int size = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				array[size] = i;
				size++;
			}
		}
		return array;
	}

	public static int[] getGoodLuck(int[] array) {
		Random random = new Random();
		int[] newA = new int[10];
		for (int i = 0; i < 10;) {
			int num = random.nextInt(array.length);
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (newA[j] == array[num]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				newA[i] = array[num];
				i++;
			}
		}
		return newA;
	}
}
