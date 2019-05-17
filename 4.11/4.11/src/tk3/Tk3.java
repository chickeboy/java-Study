package tk3;

/*
 * 循环实际运行的次数和计划的次数不一样
 */
public class Tk3 {
	public static void main(String[] args) {
		// 求和 这个和只能最大值超过400就停止累加
		double sum = 0;
		for (int i = 1; i < 50; i++) {
			sum += i;
			// System.out.println(i);
			if (sum >= 400) {
				break;// 跳出当前循环
			} // 跳出循环的条件
		}
		System.out.println(sum);
		// 直接在循环条件中加入判断
		sum = 0;
		for (int i = 1; sum < 400; i++) {// 进入循环的条件
			sum += i;
		}
		System.out.println(sum);

	}
}
