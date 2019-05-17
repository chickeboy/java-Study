//32.2006年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人
public class HK7{
	public static void main(String[] args){
		int a = 8;
		int b = 2006;
		while(a<=20){
			a *=1.25;
			b++;
		}
		System.out.println(b);
	}
}