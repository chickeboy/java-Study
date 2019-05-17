/*
有100个小朋友手拉手围成一圈，
由第一个小朋友开始从1开始数，
数到3的小朋友退出，
再从后面的小朋友从1数起，数到3的再退出，
以此游戏下去，问最后剩下哪个小朋友？
*/

public class Test{
	public static void main(String[] args){
		//100个小朋友就代表了数组的长度
		boolean[] array = new boolean[100];//初始值都是false
		for(int i = 0 ; i < array.length; i ++){
			array[i] = true;//表示默认都在圈内
		}
		int count = array.length;//圈内还存在的实际人数
		int index = 0;
		int mcount = 0;//计数器，记录的我分三进一的数数最大值是2
		while(count > 1){//什么时候才是结束,圈内只有一个人的时候才是结束
			if(array[index]){//array[i] ==true表示有人再数
				mcount++;//如果这里的结果是3
				if(mcount==3){//表示已经数到3个人了
					array[index] = false;//表示的就是这个人已经不在圈内了
					mcount = 0;//归0
					count --;//总人数应该减一
				}
			}
			//不管位置上是否有人，我们都有必要去遍历这个位置
			index++;//遍历每个位置
			if(index == 100){
				index = 0;//如果数组遍历到尾部了，就要从0号位重新开始
			}
		}
		
		//求出最后剩下的那个人的位置
		for(int i = 0 ; i < array.length; i ++){
			if(array[i]){
				System.out.println("剩下的小朋友在..................第" + (i + 1) +"位");
			}
		}
	}
}