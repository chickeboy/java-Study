package tk;

/*
 * 3.��ӡ1900�굽2100��֮������꣬һ�д�ӡ4��
 */
public class Tk3 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1900; i < 2101; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.print(i + "\t");
				count++;
				if (count % 4 == 0) {
					System.out.println();
				}
			}
		}
	}
}
