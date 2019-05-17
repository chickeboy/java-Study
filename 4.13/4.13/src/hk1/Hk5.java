package hk1;

/*
 * 5.使用do-while实现：输出摄氏温度与华氏温度的对照表，
 * 要求它从摄氏温度0度到250度，每隔20度为一项，
 * 对照表中的条目不超过10条。
     转换关系：华氏温度 = 摄氏温度 * 9 / 5.0 + 32
 */
public class Hk5 {
	public static void main(String[] args) {
		double h = 0;
		double s = 0;
		int count = 0;// 记录实际打了多少条
		System.out.println("摄氏度\t\t华氏度");
		do {
			h = s * 9 / 5 + 32;// 计算出华氏度
			System.out.println(s + "\t\t" + h);
			count++;
			if (count == 10) {
				break;
			}
			s += 20;
		} while (s <= 250);
	}
}
