import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		int[] array = new int[4];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);// 0-9µÄËæ»úÊı
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				System.out.println(array[i]);
			}
		}
	}
}
