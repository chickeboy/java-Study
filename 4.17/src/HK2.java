import java.util.Scanner;

/*2.创建一个字符串数组，长度为4，输入4个学员姓名，
 * 键盘输入姓氏，请输出所有该姓氏的学员信息*/
public class HK2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"张三","张四","王五","小明"};
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		for(int i = 0;i<array.length;i++) {			
			if(array[i].contains(str)) {
				System.out.println(array[i]);
			}
		}
		
	}

}
