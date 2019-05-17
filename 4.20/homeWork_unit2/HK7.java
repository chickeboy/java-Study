//模拟智力测验程序，提出3个问题，实现准备好答案（是或者否即可），
//最后统计该用户答错了几题
import java.util.Scanner;
public class HK7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.println("5>3");
		String  str = scanner.next();
		if(str.equals("否")){
			count++;
		}
		System.out.println("5<3");
		str = scanner.next();
		if(str.equals("是")){
			count++;
		}
		System.out.println("5>6");
		str = scanner.next();
		if(str.equals("是")){
			count++;
		}
		System.out.println("用户答错了"+ count+"道题");
	}
}