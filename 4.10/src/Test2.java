import java.util.Scanner;

public class Test2 {
	/*
	 * 16.键盘输入一个月份，判断这个月份所对应的季节 提示：3,4,5 春季 6,7,8夏季 9,10,11秋季 12,1,2冬季
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个月份");
		int month = scanner.nextInt();
		String season = "春季";
		boolean bool = false;
		if(month>0&&month<=12){
			bool = true;
			switch (month) {
			case 6:
			case 7:
			case 8:
				season = "夏季";
				break;
			case 9:
			case 10:
			case 11:
				season = "秋季";
				break;
			case 12:
			case 1:
			case 2:
				season = "冬季";
				break;
			}
		}
		if(bool) {
			
			System.out.println(month+ "月是" + season);
		}else {
			System.out.println("你的输入有误");
		}
	}

}
