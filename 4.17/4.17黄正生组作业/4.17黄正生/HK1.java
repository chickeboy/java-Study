import java.util.Scanner;

/*1.����һ�����飬¼��5�����ݣ���������һ�����ݣ���ѯ�������Ƿ���ڸ����ݣ�
 * ������ڴ�ӡ����Ӧ���±�λ�ã���������ڣ���ӡ-1��Ĭ�������д�ŵ����ݲ��ظ���*/
public class HK1 {
	public static void main(String[] args) {
		int array[] = {2,3,4,5,6};
		Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		boolean bool = true;
		for(int i = 0;i<array.length;i++) {
			if(a==array[i]) {
				System.out.println(i);
				break;
			}else {
				bool = false;
			}
		}
		if(!bool) {
			System.out.println("-1");
		}
	}
}
