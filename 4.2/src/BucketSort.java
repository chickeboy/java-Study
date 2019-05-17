import java.util.Arrays;

public class BucketSort {
	InsertSort insertSort = new InsertSort();

	public int[] main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };
		return bucketSort(arry, 5);
	}

	private int[] bucketSort(int[] arry, int bucketSize) throws Exception {
		if (arry.length == 0) {
			return arry;
		}

		int minValue = arry[0];
		int maxValue = arry[0];
		for (int value : arry) {
			if (value < minValue) {
				minValue = value;
			} else if (value > maxValue) {
				maxValue = value;
			}
		}

		int bucketCount = (int) Math.floor((maxValue - minValue) / bucketSize) + 1;
		int[][] buckets = new int[bucketCount][0];

		// 利用映射函数将数据分配到各个桶中
		for (int i = 0; i < arry.length; i++) {
			int index = (int) Math.floor((arry[i] - minValue) / bucketSize);
			buckets[index] = arryAppend(buckets[index], arry[i]);
		}

		int arryIndex = 0;
		for (int[] bucket : buckets) {
			if (bucket.length <= 0) {
				continue;
			}
			// 对每个桶进行排序，这里使用了插入排序
			bucket = insertSort.sort(bucket);
			for (int value : bucket) {
				arry[arryIndex++] = value;
			}
		}

		return arry;
	}

	/**
	 * 自动扩容，并保存数据
	 *
	 * @param arry
	 * @param value
	 */
	private int[] arryAppend(int[] arry, int value) {
		arry = Arrays.copyOf(arry, arry.length + 1);
		arry[arry.length - 1] = value;
		return arry;
	}

}

//插入排序法
class InsertSort {
	public int[] sort(int[] args) {
		for (int i = 0; i < args.length; i++) {
			int tmp = args[i];
			int j = i;
			while (j > 0 && tmp < args[j - 1]) {
				args[j] = args[j - 1];
				j--;
			}
			if (j != i) {
				args[j] = tmp;
			}
		}
		return args;
	}

}
