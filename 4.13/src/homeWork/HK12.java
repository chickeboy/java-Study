package homeWork;
/*12.使用数组存入斐波那契数列的前10项值，然后遍历输出*/
public class HK12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = new int[10];
		int a =1;
		int b = 1;
		int c = 0;
		for(int i = 0;i<arry.length;i++) {		
			arry[i] = a;
			c = a+b;
			a = b;
			b = c;
		}
		for(int  i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}

}
