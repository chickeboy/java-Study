/*1.使用while循环和双重循环打印出99乘法表*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		while (i < 10) {	
			System.out.print(j + "*" + i + "=" + i * j + "\t");
			if (j == i) {
				System.out.println();
				j=0;	
				i++;
			}			
			j++;			
		}
		System.out.println("===============");
		for(i = 1;i<10;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}
