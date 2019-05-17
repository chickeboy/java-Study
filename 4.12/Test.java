//求出所有的水仙花数（各位数字立方之和等于数本身的三位整数）并输出
/*public class Test{
	public static void main(String[] args){		
		for(int i = 100;i<1000;i++){
			double sum = 0;
				sum  = Math.pow(i% 10,3)+Math.pow(i/10%10,3)+Math.pow(i/100%10,3);
				if(sum == i){
					System.out.println(sum);
				}			
			}					
		}
	}*/
//从键盘输入一个正整数，判断其是否是素数（素数即质数，只能被1和其本身整除的数
/*import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = "是素数";
		int a = scanner.nextInt();
		for(int i = 2;i<a;i++){
			if(a%i==0){
				str = "不是素数";
				break;				
			}
		}
		System.out.println(a+str);
	}
}*/
//打印1900年到2100年之间的闰年，一行打印4个
/*public class Test{
	public static void main(String[] args){
		int a = 0;
		for(int i = 1900;i<=2100;i++){
			if((i%4==0&&i%100!=0)||i%400==0){
				System.out.print(i + "\t");
				a++;
			}
			if(a%4==0){
				System.out.println();
			}
		}
	}
}*/
//已知序列1/2,2/3,3/5,5/8,...,求其前20项之和
public class Test{
	public static void main(String[] args){
		double a1 = 1;
		double a2 = 2;
		double a3 = 0;
		double c = 0;
		double sum = 0;
		for(int i = 1;i<=20;i++){		
			c = a1/a2;	
			a3 = a1+a2;	
			a1 = a2;			
			a2 = a3;			
			sum+=c;
		}
		System.out.println(sum);
		
	}
}
/*从键盘输入一批字符（以@结束），按要求加密并输出，不允许使用工具方法
加密规则:
1、所有字母均转换为小写。
2、若是字母'a'到'y'，则转化为下一个字母。
3、若是'z'，则转化为'a'。
4、其它字符，保持不变。*/
/*import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == '@'){
				break;
			}else if(ch<='Z'&&ch>='A'){
				System.out.print(ch+=32);
			}else if(ch>='a'&&ch<='y'){
				System.out.print(ch+=1);
			}else if(ch=='z'){
				System.out.print(ch='a');
			}else{
				System.out.print(ch);
			}
		}
	}
}*/
