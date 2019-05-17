
package homeWork;

import java.util.Scanner;
/*使用方法封装的形式，完成万年历*/
public class HK10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************使用万年历**********");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		if (month <= 1 && month >= 12) {
			System.out.println("输入的月份有误");//判断月份是不是合法值，不是直接结束程序
			return;
		}
		String str = isRun(year) ? "闰年" : "平年";//调用isRun方法判断年份是不是闰年
		System.out.println(year + "是" + str);
		outrili(year, month);
	}

	public static boolean isRun(int year) {//判断闰年平年的方法是返还true不是繁华false
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int getsumdays(int year, int month) {//计算本月份之前所有月份的天数总和
		int sumdays = 0;
		for (int i = 1900; i < year; i++) {//今年之前的总天数
			if (isRun(year)) {
				sumdays += 366;
			} else {
				sumdays += 365;
			}
		}
		for(int i = 1;i<month;i++) {//今年本月份之前的总天数
			sumdays += days(year,i);//循环调用days方法得到天数加到sumdays里面
		}
		return sumdays;
	}

	public static int days(int year, int month) {//计算某个月份天数的方法
		int days = 0;
		//int sumdays = 0; 
		//for (int i = 0; i < month; i++) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				if (isRun(year)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			}
			return days;
			 //sumdays = sumdays + days; 
		//}
		//return sumdays;
	}

	public static void outrili(int year, int month) {//打印万年历的方法
		int days = days(year, month);//得到本月的天数
		int befordays =1+getsumdays(year, month)% 7;//得到上个月的结尾是星期几
		if (befordays == 7) {
			befordays = 0;
		}
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天");
		for (int i = 0; i < befordays; i++) {//本月1号开始的位置
			System.out.print("\t");
		}
		for (int i = 1; i <= days; i++) {//输出日期
			System.out.print(i + "\t");
			if ((i+befordays) % 7 == 0) {//每7个换行
				System.out.println();
			}
		}
	}
}
