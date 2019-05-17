//πÈ≤¢≈≈–Ú
import java.util.Arrays;

public class MergeSort {
	// TODO Auto-generated method stub
	int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };

	public int[] sort(int[] sourceArray) {
		if (arry.length < 2) {
			return arry;
		}
		int middle = (int) Math.floor(arry.length / 2);

		int[] left = Arrays.copyOfRange(arry, 0, middle);
		int[] right = Arrays.copyOfRange(arry, middle, arry.length);

		return merge(sort(left), sort(right));
	}

	protected int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int i = 0;
		while (left.length > 0 && right.length > 0) {
			if (left[0] <= right[0]) {
				result[i++] = left[0];
				left = Arrays.copyOfRange(left, 1, left.length);
			} else {
				result[i++] = right[0];
				right = Arrays.copyOfRange(right, 1, right.length);
			}
		}

		while (left.length > 0) {
			result[i++] = left[0];
			left = Arrays.copyOfRange(left, 1, left.length);
		}

		while (right.length > 0) {
			result[i++] = right[0];
			right = Arrays.copyOfRange(right, 1, right.length);
		}
		return result;
	}

}
