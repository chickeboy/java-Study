package tk;

import java.util.Scanner;

public class Tk7 {
	public static void main(String[] args) {
		String[] array = { "����", "����", "����", "����" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�ѧ������");
		String name = scanner.next();
		int size = 0;// ʵ����ӳɹ����±����
		int[] nameArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (name.equals(array[i])) {
				nameArray[size++] = i;
			}
		}
		if (size == 0) {
			System.out.println("������");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(nameArray[i]);
			}
		}

	}
}
