package fortk;

/*
 * 在马克思手稿中有一道趣味的数学问题：
 * 一共有30个人，可能包括男人，女人和小孩。
 * 他们在一家饭馆吃饭共花了50先令，
 * 其中每个男人花3先令，每个女人花2先令，
 * 每个小孩花1先令。
 * 请问男人、女人和小孩各几人？
 * 请编写一个程序来计算。
 */
public class Tk5 {
	public static void main(String[] args) {
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 26; j++) {
				for (int k = 0; k < 51; k++) {
					if (3 * i + 2 * j + k == 50 && i + j + k == 30) {
						System.out.println(i + "," + j + "," + k);
					}
				}
			}
		}
	}
}
