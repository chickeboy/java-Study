//ц╟ещеепР
public class maopaodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };
		for (int i = 0; i < arry.length-1; i++) {
			for (int j = 0; j < arry.length-1 - i; j++) {
				if (arry[j] > arry[j + 1]) {
					int tmp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]+"\t");
		}
	}
}
