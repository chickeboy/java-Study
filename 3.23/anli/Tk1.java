//1 + 2 + 3 +.......100的奇数和
public class Tk1{
	public static void main(String[] args){
		int sum = 0;//求和
		for(int i = 1;i < 101;i+=2){
			sum = sum + i;
		}
		System.out.println("最终的和是....." + sum);
		for(char c = 'a';c <= 'z';c++){
			System.out.println(c);
		}
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i = 0;i < 13;i++){
			System.out.print(a + ",");
			c = a + b;//先保留本次a + b的值其实就是c的值
			a = b;
			b = c;
		}
		
	}
}