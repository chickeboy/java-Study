/*
从键盘输入一个百分制分数，将其转化为等级分输出。
90以上，等级为A			90 - 100	91 92.5 93 94.5 99
80-90,等级为B，			
70-80,等级为C，
60-70，等级为D，
60分以下，等级为E
要求用switch编写
*/
import java.util.*;

public class Test{
	public static void main(String[] args){
		double score = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入一个分数");
		score = scn.nextDouble();
		//想办法去除十位之后的数，剩下的那个数的值只要是9就是90 - 100之间的数
		//如果是100这个特殊的值，那么只有10
		int nScore = 0;
		nScore = (int)(score / 10);//去除小数点后的内容
		//105 10.5 10
		String level = null;
		//我们要排除100 - 110之间的数，因为这些数去掉十位数之后的数值剩下的都是10
		if(score <=100 && score >= 0){
		switch(nScore){
			case 10:
			case 9:
						level = "A";
						break;
			case 8:
						level = "B";
						break;
			case 7:
						level = "C";
						break;
			case 6:
						level = "D";
						break;
			case 5:
			case 4:
			case 3://0 - 6的取值范围
			case 2:	//代码的穿透，直到遇到break为止，除非有特殊要求一般break都不省略
			case 1:
			case 0://个位分数不要遗忘
						level = "E";
						break;
		}
		}
		if(level == null){
			System.out.println("您输入的分数不合法");
		}else{
			System.out.println("您输入分数等级是" + level);
		}
	}
}




