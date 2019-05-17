package tk;

/*
 * 二维数组：java本身是没有多维这个概念的
 * 其实二维数组就是一个一维数组中套了多个一维数组
 */
public class Tk2 {
	public static void main(String[] args) {
		// int[] a = {1,2};
		int[][] array = { { 1, 2 }, { 2, 3, 4 }, { 4, 5 } };
		// 访问某一个值
		System.out.println(array[2][1]);
		System.out.println(array[1][1]);
		System.out.println(array[0][0]);
		// 二维数组的遍历
		for (int i = 0; i < array.length; i++) {
			// 访问高维，也就是楼层数
			System.out.print("{");
			for (int j = 0; j < array[i].length; j++) {
				// array[i].length表示每层楼有几个房间
				System.out.print(array[i][j] + ",");
			}
			System.out.println("}");
		}
		// 二维数组的动态录入
		// 四层楼，每层楼5个房间 一共20个房间
		int[][] a1 = new int[4][5];
		int[][] a2 = new int[4][];// 有楼层数，没有房间数
		// 二维数组可以创建的时候省略低纬的，但是
		// 后续一定要手动赋值，也就是开辟内存空间
		a2[0] = new int[4];
		a2[1] = new int[2];
		a2[2] = new int[1];
		a2[3] = new int[5];

	}
}
