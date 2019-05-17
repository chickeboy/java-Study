/*求1+1/3+1/5+...之和，直到某一项的值小于10-6时停止累加*/
public class Test11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 1.0;
		double a = 3.0;
		for(int i =1;true;i++) {
			sum = sum+1/a;
			a+=2;			
			if(1/a<Math.pow(10, -6)) {			
				break;
			}
		}
		System.out.println(sum);
	}
}
