/*Çó1-1/3+1/5-1/7+...-1/99+1/101 Ö®ºÍ*/
public class Test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 1;
		double a = 3.0;
		int i = 2;
		do {
			
			if (i % 2 == 0) {
				sum = sum-1/a;
				a+=2;
			}else {
				sum = sum+1/a;
				a+=2;
			}
			i++;
		} while (a <= 101);
		System.out.println(sum);
	}

}
