package hk1;

import java.util.Arrays;
import java.util.List;

/*��asdascveasrgdfsdf����ȡ���ַ����У�ÿһ����ĸ���ֵĴ�����
Ҫ�󣺴�ӡ����ǣ�a(2)b(1)...*/
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
