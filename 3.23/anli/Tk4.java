public class Tk4{
	public static void main(String[] args){
		//双重循环,外循环，内循环
		//外循环走一次，内循环走n次
		for(int i = 0; i < 3;i++){
			for(int j = 0;j < i + 1;j++){
				System.out.print("*");
			}
			System.out.println();//换行
		}
		
	}
}