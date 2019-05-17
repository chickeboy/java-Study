package tk;
/*有100个小朋友手拉手围成一圈，由第一个小朋友开始从1开始数，
数到3的小朋友退出，再从后面的小朋友从1数起，数到3的再退出，
以此游戏下去，问最后剩下哪个小朋友？*/
public class HK7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		int count = 0;
		int index = array.length;
		while (index > 1) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != -1) {
					count++;
					if (count == 3) {
						array[i] = -1;
						count = 0;
						index--;
					}
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1) {
				System.out.println(i+1);
			}
		}
	}

}
