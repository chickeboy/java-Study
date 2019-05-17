package home;

/*
有100个小朋友手拉手围成一圈，
由第一个小朋友开始从1开始数，
数到3的小朋友退出，再从后面的小朋友从1数起，
数到3的再退出，以此游戏下去，问最后剩下哪个小朋友
1.一个长度为100的数组
2.数组的循环下标自己定义
3.下标每次到99都要归零，从头开始，圆环
4.在数数的时候，每个位置还是要经过的，但是呢要判断这个位置上
是否有人，有人的话计数器才会+1  如果遇到3的时候这个位置上的人就
要退出
5.是否位置上有人，利用数组的位置上的值去判断
6.上来要创建数组，其中的值都是一样的，如果退出的位置
改变数组位置上的值，作为区分
 */
public class Hk8 {
	public static void main(String[] args) {
		boolean[] array = new boolean[100];
		// 1.给整个数组赋值为true,表示位置上有人
		for (int i = 0; i < array.length; i++) {
			array[i] = true;
		}
		int count = array.length;// 总人数，会变得，每次少一个人 count --
		// 最后循环跳出的条件是根据这个count来的
		// 数组中实际存放的元素个数
		int index = 0;// 表示下标，起始点 0号位
		int mCount = 0;// 用来数123
		while (count > 1) {// 只剩一个的话循环结束
			if (array[index] == true) {
				// 位置上可能是false也可能是true
				// 如果是true表示有人，应该数数
				mCount++;
				if (mCount == 3) {
					array[index] = false;// 这个位置表示没人了
					count--;// 总人数少一个，true的值就少了一个
					mCount = 0;// 重新开始数
					System.out.println(index + "出局");
				}
			}
			index++;// 不管有没有人，数组的每个位置必须经历
			if (index == 100) {// index到99位了，重新开始
				index = 0;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == true) {
				System.out.println(i);
			}
		}

	}
}
