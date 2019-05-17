//6.2006年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人
/*public class Test1{
	public static void main(String[] args){
		double a = 8;
		int i  = 2006;
		while(a<=20){
			a = a+a*0.25;
			i++;
		}
		System.out.println(i);
	}
}*/
//求出1-1000中所有即可以被3也可以被5整除的数的和
/*public class Test1{
	public static void main(String[] args){
		int i = 1;
		while(i<=1000){
			if(i%3==0&&i%5==0){
				System.out.println(i);
			}
			i++;
		}
	}
}*/
//从键盘输入一个正整数，将该数前后倒置后输出
/*import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int i = 0;
		int b = 0;
		while(Math.pow(10,i)<a){
			
			b = b*10+a/(int)Math.pow(10,i)%10;
			i++;
		}
		System.out.println(b);
	}
}*/
//从键盘输入账号密码，全部错误，密码错误，账号错误，都给出提示
//直到输入正确为止
/*import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		
		String name1 = "abcdef";		
		String pasw1 = "aa12345";
		while(true){
			String name = scanner.next();
			String pasw = scanner.next();			
			if(!name.equals(name1)&&!pasw.equals(pasw1)){
				System.out.println("全部错误");
				continue;
			}else if(!name.equals(name1)){
				System.out.println("账号错误");
				continue;
			}else if(!pasw.equals(pasw1)){
				System.out.println("密码错误");
				continue;
			}else{
				System.out.println("输入正确");
				break;
			}
		}
	}
}*/
//打印出斐波那契数列的前10项值
public class Test1{
	public static void main(String[] args){
		int i = 0;
		int a = 1;
		int b = 0;
		int c = 0;
		while(i<10){	
			c= a+b;
			a = b;
			b = c;
			i++;
			System.out.println(c);
		}
	}
}

