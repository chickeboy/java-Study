import java.util.Scanner;

/*2.����һ���ַ������飬����Ϊ4������4��ѧԱ������
 * �����������ϣ���������и����ϵ�ѧԱ��Ϣ*/
public class HK2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"����","����","����","С��"};
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		for(int i = 0;i<array.length;i++) {			
			if(array[i].contains(str)) {
				System.out.println(array[i]);
			}
		}
		
	}

}
