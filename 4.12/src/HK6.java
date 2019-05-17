/*6.使用双重循环打印出2个等腰三角形 4个直角三角形*/
public class HK6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
			for (int j = 0; j < 10 - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======================");
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j >= 10 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=======================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=======================");
	for(int i = 0;i<11;i++) {
		for(int j = 0;j<21;j++) {
			if(j>=11-i&&j<10+i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
		System.out.println("=======================");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 21; j++) {
				if (j >= i && j <= 18 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
