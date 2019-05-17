/*
打印出以下菱形
        *
     * * * 
  * * * * *
* * * * * * *
   * * * * *
     * * *
        *
*/
public class Test{
	public static void main(String[] args){
		//外循环的次数决定了三角形的高，也就是你打印了多少行的内容
		for(int i = 1; i < 5 ; i ++){//i这里要给1不然少打一行*
			//外循环执行一次，内循环要做2件事情，1.打印空格，2.打印*
			// 内循环因为每次外循环执行过后都会发生次数的改变，所以内循环
			// 的条件变量取值范围应该根据外循环的变量i来进行判断
			for(int j = 0;j < 4 - i; j ++){
				System.out.print(" ");//这里不能换行
			}
			//打印*
			for(int k = 0 ;k < 2 * i - 1;k++){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
		//倒三角形
		for(int i = 1; i < 4;i++){//这里要少打一行
			for(int j = 0; j < i;j++){
				System.out.print(" ");//这里不能换行
			}
			for(int k = 0;k < 2 * (4 - i) - 1;k ++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}