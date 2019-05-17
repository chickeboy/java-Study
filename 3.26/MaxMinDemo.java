public class MaxMinDemo{
	public static void main(String[] args){
		int array[] = {10,20,90,60,30,70};
		int Max = array[0];
		int Min = array[0];
		for(int i = 0;i<array.length;i++){
			if(array[i] > Max){
				Max = array[i];
			}
			if(array[i] < Min){
				Min = array[i];
			}
		}
		System.out.println("最大值为"+ Max + "最小值为" + Min);
	}
}