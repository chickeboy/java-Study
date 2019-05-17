/*
循环结构:重复执行同一段代码逻辑
for
1.打印出 1 - 100的和
2.打印出字母a - z
3.根据数列 1 1 2 3 5 8 13 ......求出第十三项
*/
public class Test{
	public static void main(String[] args){
		//i++  i = i + 1;同等的效果
		int i = 0;
		for(;i < 30;i--){//执行代码
			System.out.println("i = " + i);
		}
		System.out.println(i);
	}
}