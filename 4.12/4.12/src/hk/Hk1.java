package hk;

/*
 * 计算半径从1开始到10范围内面积小于等于10的圆面积
 */
public class Hk1 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			double sum = Math.PI * Math.pow(i, 2);
//			if (sum <= 10) {
//				System.out.println(sum);
//			} else {
//				break;
//			}
			if (sum > 10) {
				break;
			}
			System.out.println(sum);
		}
	}
}
