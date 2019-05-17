//23.计算半径从1开始到10范围内面积小于等于10的圆面积
public class HK5{
	public static void main(String[] args){
		double area = 0;
		for(int i = 1;i<=10;i++){
			area = Math.pow(i,2)*Math.PI;
			if(area<10){
				System.out.println(area);
			}
		}
	}
}