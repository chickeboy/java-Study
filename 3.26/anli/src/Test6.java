import java.util.Arrays;
import java.util.Random;

public class Test6 {
	public static void main(String[] args) {
		int[] array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100000);
		}
		long start = System.currentTimeMillis();
//		for (int i = 0; i < array.length - 1; i++) {
//			for (int j = 0; j < array.length - i - 1; j++) {
//				if (array[j] > array[j + 1]) {
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
		Arrays.sort(array);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
