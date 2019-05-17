package tk;

/*
 * 分支结构的第三种结构
 * if(){
 * 
 * }else if(){
 * 
 * }else{
 * 
 * }
 *只会满足一个条件，注意是按照编写的顺序来判断的
 */
public class Tk14 {
	public static void main(String[] args) {
		int a = 0;
		if (a >= 0) {
			System.out.println(">0");
		} else if (a == 0) {
			System.out.println("==0");
		} else {
			System.out.println("<0");
		}
		System.out.println(3 + 4);
	}
}
