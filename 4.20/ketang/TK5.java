package ketang;
/*编写一个方法，用于将一个人的身份证编号解析成：1988-04-30这样的日期格式输出
*/
public class TK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "*****119970219****";
		riqi(str);
	}
	public static void riqi(String str) {
		String year = str.substring(6,10);
		String month = str.substring(10,12);
		String days = str.substring(12,14);
		System.out.println(year+"-"+month+"-"+days);
	}

}
