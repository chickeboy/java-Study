import java.util.Arrays;
import java.util.Scanner;

public class KS2 {
	public static void main(String[] args) {
		int array[] = new int[5];
		array = getarray(array);
		find(array);
		select(array);
	}

	public static int[] getarray(int[] array) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static void find(int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����Ҫ���ҵ�����");
		int a = scanner.nextInt();
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (a == array[i]) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println(a + "�ڵ�" + index + "��λ��");
		} else {
			System.out.println(index);
		}
	}

	private static void select(int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����Ҫ���������");
		int[] array2 = Arrays.copyOf(array, array.length + 1);
		int a = scanner.nextInt();
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (a == array[i]) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			array2[index + 1] = a;
			for (int i = index + 1; i < array.length; i++) {
				array2[i + 1] = array[i];
			}
		} else {
			System.out.println("û���ҵ�");
		}
		output(array2);
	}

	private static void output(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
