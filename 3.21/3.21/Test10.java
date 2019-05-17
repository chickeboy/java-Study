public class Test10{
	public static void main(String[] args){
		//4年一闰，百年不闰，4百年又闰
		int year = 1940;
		String res = "不是"
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			res = "是";
		}
		System.out.println(year + res + "闰年");
	}
}