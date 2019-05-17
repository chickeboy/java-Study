package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 歌手打分：在歌唱比赛中，共有10位评委进行打分，
 * 在计算歌手得分时，去掉一个最高分，去掉一个最低分，
 * 然后剩余的8位评委的分数进行平均，就是该选手的最终得分。
 * 输入每个评委的评分，求某选手的得分
 */
public class Hk6 {
	public static void main(String[] args) {
		double[] array = new double[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length;) {
			System.out.println("请输入一个分数");
			double score = scanner.nextDouble();
			if (score > 100 || score < 0) {
				System.out.println("请输入0-100的分数");
			} else {
				array[i] = score;// 符合条件，才存入数组
				i++;
			}
		}
		Arrays.sort(array);// 先排序，最低分就是0号位
		// 最高分就是array.length - 1
		double sum = 0;
		for (int i = 1; i < array.length - 1; i++) {
			sum += array[i];
		}
		double avg = sum / (array.length - 2);
		System.out.println("平均分是。。。。" + avg);
	}
}
