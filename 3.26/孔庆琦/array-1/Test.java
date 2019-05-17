/*
随机产生40个10到50的整数，
统计每个数字各出现几次，
出现0次的数字不打印，
并且求出出现最多次数的数字，
和他出现的次数
*/
import java.util.Random;
public class Test{
	public static void main(String[] args){
		int[] array = new int[40];//创建40长度的数组
		Random random = new Random();//创建一个随机数的工具对象
		//对数组进行数据的录入
		for(int i = 0;i < array.length;i++){
			array[i] = 10 + random.nextInt(41);//左闭右开，所以右边是小于不是小于等于
		}
		//这里的话要默认所有的10-50中包括的数字都出现过
		
		int maxNum = 0;//出现次数最的数字
		int maxCount = 0;//出现最多的数字出现的次数
		for(int i = 10; i < 51 ; i++){
			int count = 0;//定义循环外的话之后的累加就导致了结果的不正确
			//我们应该让计数器在每次循环开始时都初始化
			for(int j = 0;j < array.length;j++){
				if(array[j] == i){//常量值在数组中出现了
					count++;//计数器+1
				}
			}//内循环执行完毕就要打印数字和出现的次数
			if(count!=0){//要判断非0次
				System.out.println(i + "出现了................." + count + "次");
			}
			if(count > maxCount){
				maxCount = count;//覆盖值
				maxNum = i;//出现最多次数的数字
			}
		}
		System.out.println("出现次数最多的数字是 " + maxNum +"出现了........" + maxCount+"次");
	}
}