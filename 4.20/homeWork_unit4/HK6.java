/*28.有100个小朋友手拉手围成一圈，
由第一个小朋友开始从1开始数，
数到3的小朋友退出，
再从后面的小朋友从1数起，
数到3的再退出，以此游戏下去，
问最后剩下哪个小朋友？*/
public class HK6{
	public static void main(String[] args){
		boolean array[] = new boolean[100];
		for(int i =0;i<array.length;i++){
			array[i] = true;
		}
		int index = array.length;
		int count = 0;
		while(index>1){
			for(int i = 0;i<array.length;i++){
				if(array[i]){
					if(count==3){
						count = 0;
						array[i]=false;
						index--;
					}
					count++;	
				}
			}
		}
		for(int i =0;i<array.length;i++){
			if(array[i]){
				System.out.println(i);
			}
		}
		
	}
}