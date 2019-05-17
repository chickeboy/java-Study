public class BubbleSort{
	public static void main(String[] args){
		int array[] = {1,5,3,2,6,7,9,13,54,20};
		for (int i = 0; i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for (int i = 0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
	}
}