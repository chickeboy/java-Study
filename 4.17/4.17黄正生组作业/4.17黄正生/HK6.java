import java.util.Scanner;

/*5.歌手打分：在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，
去掉一个最高分，去掉一个最低分，然后剩余的8位评委的分数进行平均，
就是该选手的最终得分。输入每个评委的评分，求某选手的得分*/
public class HK6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array[] = new double[10];
		
		double sum = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个评委的分数");
			array[i] = scanner.nextDouble();
		}
		double max = array[0];
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
			sum += array[i];
		}
		System.out.println("选手的得分为：" + (sum - max - min) / 8);
	}

}
