package hk1;

import java.util.Arrays;
import java.util.List;

/*“asdascveasrgdfsdf”获取该字符串中，每一个字母出现的次数。
要求：打印结果是：a(2)b(1)...*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asdascveasrgdfsdf";
		List<String> lis = Arrays.asList(str.split(""));
		char a = 'a';
		while (a <= 'z') {
			int count = 0;
			String s = String.valueOf(a);
			for (String string : lis) {
				if (string.equals(s)) {
					count++;
				}
			}
			a++;
			if (count!=0) {
				
				System.out.println(a+"("+count+")");
			}
		}

	}

}
