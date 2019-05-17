package tk3;

/*
 * 
 *  求1+1/3+1/5+...的前20项之和
 */
public class Tk4 {
	public static void main(String[] args) {
		double sum = 0;
		// 计数器 当你的循环未知次数的时候
		// 需要自己去创建一个变量，去记录循环实际
		// 执行的次数
		int count = 0;
		for (int i = 1; count < 20; i += 2) {
			sum += 1.0 / i;
			count++;
//			if (count == 20) {
//				break;
//			}
		}
		System.out.println(sum);
		sum = 0;
		int i = 1;
		for (int j = 0; j < 20; j++) {
			sum = sum + 1.0 / i;
			i += 2;
		}
		System.out.println(sum);
	}
}
