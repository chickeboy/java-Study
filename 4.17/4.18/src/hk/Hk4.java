package hk;

import java.util.Random;

/*
 * 随机产生40个10到50的整数，
 * 统计每个数字各出现几次，出现0次的数字不打印
 * key   				value
 * 出现的数字 唯一的             可以变化的
 */
public class Hk4 {
	public static void main(String[] args) {
		// 1.先做容器
		int[] array = new int[40];
		// 2.对容器进行赋值
		// 3.随机数
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(41) + 10;// 0 - 40的随机数
		}
		for (int i = 10; i < 51; i++) {
			// 拿外循环i的值去匹配内循环数组中所有的数
			int count = 0;// 代表外循环每一次执行都会申请一个新的变量
			// 因为这个次数时候统计的每一个数值，不需要叠加
			for (int j = 0; j < array.length; j++) {
				// ，每次外循环执行一次，都会去拿i去匹配数组中每个位置
				if (i == array[j]) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + "出现了...." + count + "次");
			}
		}
	}
}
