package hk;

//1.计算半径从1开始到10范围内面积小于等于10的圆面积
public class HK1 {
	public static void main(String[] agrs) {
		double sun = 0;
		for (int i = 1; i < 11; i++) {
			sun = Math.PI * Math.pow(i, 2);
			if (sun <= 10) {
				System.out.println("小于等于10的圆面积为" + sun);
			} else {
				break;//循環到了11自然會退出
			}
		}

	}
}