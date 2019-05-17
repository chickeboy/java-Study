import java.util.Scanner;
public class wannianli{
	public static void main(String[] args){
		int year;
		int month;
		boolean isrun;
		int days = 0 ;
		int totaldays = 0;
		System.out.println("**************使用万年历**********");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		year = scanner.nextInt();
		System.out.println("请输入月份");
		month = scanner.nextInt();
		if((year%400 == 0)||(year%4 == 0 && year % 100 != 0)){
			isrun = true;
		}else{
			isrun = false;
		}
	    if(isrun){
		    System.out.println(year+"是闰年");
	    }else{
			System.out.println(year+"不是闰年");
		}
		for(int i = 1900;i<year;i++){
			if((year%400 == 0)||(year%4 == 0 && year % 100 != 0)){
			    totaldays += 366;
		    }else{
				totaldays+=365;
			}
		}
		for(int i = 0 ;i <= month;i++){
			switch(i){
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
				  if(isrun){
					days = 29;
				  }else{
					days = 28;
				  }
				  break;
				case 4:
				case 6:
				case 9:
				case 11:
				  days = 30;
				  break;
				default:
					System.out.println("输入的月份有误");
			
			}
			if(i != month){
			totaldays +=days;	
			}
		}
		int befordays;
		befordays = 1 + totaldays%7;
		if(befordays == 7){
			befordays = 0;
		}
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for(int i = 0;i<=befordays;i++){
			System.out.print("\t");
		}
		for(int i = 1;i<=days;i++){
			System.out.print(i + "\t");
			if(i+befordays%7==0){
				System.out.println();
			}
		}
	}
}