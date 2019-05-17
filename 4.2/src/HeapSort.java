//¶ÑÅÅÐò
public class HeapSort {
	public int[] main(String[] args) {
		int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };
		int len = arry.length;
		buildMaxHeap(arry, len);

		for (int i = len - 1; i > 0; i--) {
			swap(arry, 0, i);
			len--;
			heapify(arry, 0, len);
		}
		return arry;
	}

	private void buildMaxHeap(int[] arr, int len) {
		for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
			heapify(arr, i, len);
		}
	}

	private void heapify(int[] arr, int i, int len) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;

		if (left < len && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < len && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != i) {
			swap(arr, i, largest);
			heapify(arr, largest, len);
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
