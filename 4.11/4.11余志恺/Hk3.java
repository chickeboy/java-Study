package hk;
//3.	��1!+5!+9!+...+21!֮�͡�

public class Hk3{
		public static void main(String[] args){
		double sum = 0;
		double sum1 = 1;
		int i = 1;
		if (i%4==1){
		for (i = 1;i<22;i++){
			sum1 = i * sum1;
			}sum = sum + sum1;
		}
		System.out.println("1!+5!+9!+...+21!�ĺ�Ϊ"+sum);
}
}
