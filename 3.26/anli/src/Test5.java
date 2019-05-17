/*
 * ≈≈–Ú
 */
public class Test5 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 6, 1, 2 };
		// √∞≈›≈≈–Ú
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
