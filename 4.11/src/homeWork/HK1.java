/*1.计算半径从1开始到10范围内面积小于等于10的圆面积*/
package homeWork;

public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			double S = Math.PI*i*i;
			if(S<=10.0) {
				System.out.println(S);
			}
		}
	}

}
