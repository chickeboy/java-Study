//≤Â»Î≈≈–Ú
public class InsertSort2 {
	public static void main(String[] args) {
		int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };
		for (int i = 0; i < arry.length; i++) {
			int tmp = arry[i];
			int j = i;
			while (j > 0 && tmp < arry[j - 1]) {
				arry[j] = arry[j - 1];
				j--;
			}
			if (j != i) {
				arry[j] = tmp;
			}
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
	}
}
