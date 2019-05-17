/*
用户键盘输入年，月，日，
判断其输入的数据是否合法，
如果不合法（比如输入了负数）则提示输入有误，
如果输入合法则输出该日期。
提示：
一，三，五，七，八，十，腊(十二)是大月(31天)
二月可能有28天(平年)也可能有29天(闰年)
既不是大月也不是小月
剩下的四，六，九，十一都是小月(30天)
*/


import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		//1.录入数据
		int year = 0 ;
		System.out.println("请输入年");
		year = scn.nextInt();
		int month = 0;
		System.out.println("请输入月");
		month = scn.nextInt();
		int day = 0;
		System.out.println("请输入日");
		day = scn.nextInt();
		//2.常识性的判断
		boolean flag = true;//表示代码的合法性，输入数据的合法性，后续会发生改变
		if(year<0||month > 12||month < 0 || day >31 || day < 0){
			flag = false;//表示不合法
		}
		//四年一闰，百年不闰，四百年又闰
		//记录是否是闰年的状态
		boolean isRun = false;
		if(year % 4 == 0 && year % 100 !=0 || year % 400==0){
			isRun = true;
		}
		//判断天数的合法性
		int days = 0;//记录输入的月份应该有的天数
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
						days = 31;//利用代码的穿透来进行大月天数的赋值31天
						break;
			case 4:
			case 6:
			case 9:
			case 11:
						days = 30;
						break;//表示小月
			case 2://闰年和非闰年的判断
						if(isRun){//isRun == true
							days = 29;
						}else{
							days = 28;
						}
						break;
			
			}
			if(day > days){//判断如果用户输入的日大于了当前月份对应的天数，
				flag = false;
			}
			if(flag){
				System.out.println("您输入的日期为............." + year +"年" +month+"月" + day+"日");
			}else{
				System.out.println("您输入的日期不合法");
			}
		
		
		
		
	}
}