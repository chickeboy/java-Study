public class Tk3{
	/*
	用单循环打印99乘法表
	1.第一项不会大于第二项
	2.当两项值相同的时候应该换行
	3.
	*/
	public static void main(String[] args){
		int i = 1;
		int j = 1;
		while(j < 10){
			System.out.print(i + "*" + j + "=" + i * j + "\t");
			if(i == j){
				System.out.println();
				i = 0;
				j++;
			}
			i++;
			
		}
	}
}