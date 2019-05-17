import java.util.Scanner;
public class Test{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数组长度");
		int i = scanner.nextInt() ;
		String array[] = new String[i];
		for(i = 0;i<array.length;){
			System.out.println("请输入第" + (int)(i+1) + "个字符");
			String str = scanner.next();
			if(str.length() <= 3){
				array[i] = str;
				i++;
			}else{
				System.out.println("字符串长度超过3！");
				
			}
		}
		for(i = 0;i<array.length;i++){
			System.out.println("第" + (int)(i+1) + "个字符是");
			System.out.println(array[i]);
		}
	}
}