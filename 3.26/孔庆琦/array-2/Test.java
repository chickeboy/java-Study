/*
模拟为歌手打分：在歌唱比赛中，
共有10位评委进行打分，在计算歌手得分时，
去掉一个最高分，去掉一个最低分，
然后剩余的8位评委的分数进行平均，
就是该选手的最终得分。输入每个评委的评分，求某选手的得分。
*/
import java.util.*;
public class Test{
	public static void main(String[] args){
		double[] array = new double[10];
		Scanner scn = new Scanner(System.in);
		//对选手的评分其实就是循环录入数组数据的一个过程
		for(int i = 0; i < array.length;i++){
			System.out.println("请输入一个分数");
			double score = 0;
			score = scn.nextDouble();
			if(score >100||score < 0){//不合法，不能去录入进数组中
				System.out.println("您输入的分数不合法，请重新输入");
				i--;//表示数组的下标回退一个，也就是循环和数组下标同时倒退
			}else{
				array[i] = score;
			}
			
		}
		//Arrays对数组进行一系列操作的工具类，提供了很多的简便的方法
		Arrays.sort(array);//调用Arrays.sort()方法进行排序，升序排列
		//数组的0号位是最小值，最后一位是最大值 array.length - 1
		double sum = 0;
		//求出总分，当然要去除2个人
		for(int i = 1 ; i< array.length - 1;i++){
			sum += array[i];
		}
		double avg = 0;//平均分
		avg = sum / (array.length - 2);
		System.out.println("最后的平均分是..............." + avg);
	}
}