package hk;
//1.	计算半径从1开始到10范围内面积小于等于10的圆面积
public class Hk1{
	public static void main(String[] args){
		double sum = 0;
		for (int r = 1;r<11;r++){
			sum = Math.pow(r,2)*Math.PI;
			if (sum>10){
				break;
			}System.out.println("半径为"+r+"的圆面积为"+sum);
		}
}
}