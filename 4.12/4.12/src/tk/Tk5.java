package tk;

import java.util.Scanner;

/*
 * 从键盘输入一批字符（以@结束），按要求加密并输出，
 * 不允许使用工具方法
加密规则:
1、所有字母均转换为小写。
2、若是字母'a'到'y'，则转化为下一个字母。
3、若是'z'，则转化为'a'。
4、其它字符，保持不变。
 */
public class Tk5 {
	public static void main(String[] args) {
		String str = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入");
		str = scanner.next();
		String newStr = "";
		// str.length长度,表示里面的字符有多少个
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '@') {
				break;
			}
			if (c >= 'A' && c <= 'Z') {
				c += 32;// 转小写
			}
			if (c >= 'a' && c <= 'y') {
				c += 1;
			} else if (c == 'z') {
				c = 'a';
			}
			newStr += c;
		}
		System.out.println(newStr);
	}
}
