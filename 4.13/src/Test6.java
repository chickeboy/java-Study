import java.util.Scanner;

/*����һ������Ϊ5�����飬�ֶ�¼��5���������ݣ����ұ������
*/
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}

}
