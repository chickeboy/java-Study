package hk;

//1.计算半径从1开始到10范围内面积小于等于10的圆面积
public class Hk1 {
	public static void main(String[] args) {
		double s = 0;
		for (double r = 1.0;; r++) {
			s = Math.PI * r * r;
			if (s <= 10) {
				System.out.println(s);
			}
		}
	}
}
