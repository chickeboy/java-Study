public class Test2{
	public static void main(String[] args){
		int array[] ={3,2,9,6,4,7,8};
		for(int i= 0;i<array.length-1;i++){
			for(int j = 0;j<array.length-1-i;j++){
			    if(array[j] > array[j+1]){
				   array[j] = array[j] + array[j+1];
				   array[j+1] = array[j] - array[j+1];
				   array[j] = array[j] - array[j+1];
			    }
			}
		}
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
	}
}