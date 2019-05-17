/*
分支结构
通过代码的判断，根据实际情况代码会发生跳转
if(表达式){
	
}

*/
public class Test9{
	public static void main(String[] args){
		int a = 3;
		if(a > 0){//a == 3 true
			System.out.println(">0");
		}else{//else表示出了之前给出的条件以外所有的条件
			if(a == 0 ){
				System.out.println("==0");
			}else{
				System.out.println("<0");
			}
		}
		
	}
}