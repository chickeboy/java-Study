/*5.使用do-while实现：输出摄氏温度与华氏温度的对照表，
 * 要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的条目不超过10条。
转换关系：华氏温度 = 摄氏温度 * 9 / 5.0 + 32*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("摄氏度" + "\t" + "华氏度");
		int i=0;
		int a = 0;
		do {		
			double b = a*9/5.0+32;
			System.out.println(a+"\t" +b);
			a+=20;
			i++;
		}while(i<=10);
	}

}
