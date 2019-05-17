/*使用两种静态创建数组的方式，创建2个数组并且存入数据 2,3,4,5,6,
并且遍历输出2个数组（打印格式: 下标：x    数值 x）*/
public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = {2,3,4,5,6};
		int arry1[] ={2,3,4,5,6};	
		
		for(int i = 0;i<arry.length;i++) {
			System.out.println(i+"\t"+arry[i]+"\t"+arry1[i]);
		}
	}

}
