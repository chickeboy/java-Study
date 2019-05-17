//¼ÆÊýÅÅÐò
public class CountingSort {

	public int[] sort(int[] sourceArray) {
		// TODO Auto-generated method stub
		int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };
		 int maxValue = getMaxValue(arry);
		return countingSort(arry, maxValue);
	}
	private int[] countingSort(int[] arry, int maxValue) {
        int bucketLen = maxValue + 1;
        int[] bucket = new int[bucketLen];

        for (int value : arry) {
            bucket[value]++;
        }

        int sortedIndex = 0;
        for (int j = 0; j < bucketLen; j++) {
            while (bucket[j] > 0) {
                arry[sortedIndex++] = j;
                bucket[j]--;
            }
        }
        return arry;
    }

    private int getMaxValue(int[] arry) {
		int maxValue = arry[0];
        for (int value : arry) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }


}
