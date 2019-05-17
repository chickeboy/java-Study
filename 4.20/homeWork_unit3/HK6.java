//Çó1!+5!+9!+...+21!Ö®ºÍ
public class HK6{
	public static void main(String[] args){
		double sum = 0;
		int a = 1;
		int b = 1;		
		while(a<=21){
		b= 1;
			for(int i = 1;i<=a;i++){
				b = b*i;	
			}
		sum+=b;
		a+=4;
		}
		System.out.println(sum);
	}
}