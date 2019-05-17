/*李先生岁数的平方与他的夫人的岁数之和是1053，
而他的夫人的岁数的平方与他的岁数之和是873，
请编写程序计算李先生及其夫人的岁数各是多少*/

public class Test2 {
	public static void main(String[] args) {
				
		for (int a = 0;; a++) {
			for (int b = 0; b < a; b++) {
				if (Math.pow(a, 2) + b == 1053 && Math.pow(b, 2) + a == 873) {
					System.out.println(a +"\t"+ b);
				}
			}
		}
	}
}
