package hk;

//3.��1!+5!+9!+...+21!֮�͡�
public class Hk3 {
	public static void main(String[] args) {
		double num = 1;
		double sum = 0;
		for (int i = 1; i <= 21; i++) {
			num = num * i;
			if ((i - 1) % 4 == 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}
