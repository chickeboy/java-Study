import java.util.Scanner;

/*2.����һ���ַ������飬����Ϊ4������4��ѧԱ������
 * �����������ϣ���������и����ϵ�ѧԱ��Ϣ*/
public class HK2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"����","����","����","С��"};
		Scanner scanner = new Scanner(System.in);
		String str2 = scanner.next();
		for(int i = 0;i<array.length;i++) {	
			String str = array[i];
			if(str.contains(str2)) {
				System.out.println(array[i]);
			}
		}
		
	}

}
