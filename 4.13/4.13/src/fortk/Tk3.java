package fortk;

/*
 * 李先生岁数的平方与他的夫人的岁数之和是1053，
 * 而他的夫人的岁数的平方与他的岁数之和是873，请编写程序计算李先生及其夫人的岁数各是多少
 */
public class Tk3 {
	public static void main(String[] args) {
		for (int i = 0; i < 150; i++) {
			for (int j = 0; j < 150; j++) {
				if (i * i + j == 1053 && j * j + i == 873) {
					System.out.println(i + "," + j);
				}
			}

		}
	}
}
