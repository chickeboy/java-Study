//—°‘Ò≈≈–Ú
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };
		for (int i = 0; i < arry.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arry.length; j++) {
				if (arry[j] < arry[min]) {
					min = j;
				}
			}
			if (i != min) {
				int tmp = arry[i];
				arry[i] = arry[min];
				arry[min] = tmp;

			}
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]+"\t");
		}
	}

}
