public class selectionSort{
	public static void main(String[] args){
		int array[] = {3,2,6,7,1,9,4};
		for(int i = 0;i<array.length-1;i++){
			int a = i;
			for(int j = i+1;j<array.length;j++){
				if(array[j] < array[a]){
					a = j; 
				}
			}
			int temp = array[i];
			array[i] = array[a];
			array[a] = temp;
		}
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
	}
}