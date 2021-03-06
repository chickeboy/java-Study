/*
求1/1+1/3+1/5 +...之和，直到某一项的值小于10-6时停止累加，并输出累加的和
*/
public class Test{
	public static void main(String[] args){
		//for循环三个表达式 int i = 1 i就是分母 每次递增2 +=2
		//取值的范围未知，先空着，这个时候循环就是一个死循环
		double sum = 0;// 因为是分数，所以结果值是浮点型
		for(int i = 1; ; i +=2){
			double num = 1.0 / i;//两个数据类型做数学运算，最后提升为精度较高的数据类型
			if(num < Math.pow(10,-6)){
				break;//停止累加，跳出循环，不再是一个死循环了
				//很关键的一点是判断条件是要能够满足的，如果无法执行到的判断语句，这里依然是死循环
			}
			sum += num;//累加求和，先判断再累加
		}
		System.out.println("最终的结果值是.........." + sum);
		
	}
}