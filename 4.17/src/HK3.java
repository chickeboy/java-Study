import java.util.Scanner;

/*3.����һ���ַ������飬����Ϊ4������4��ѧԱ�����������������ϣ�
 * �ֱ���������ϵ�һ�γ��ֵ��±�λ�ã������һ�γ��ֵ��±�λ�ã���������ڣ����ӡ������*/
public class HK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "����", "����", "����", "С��" };
		int arrays[] = new int[array.length];
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		boolean bool = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(str)) {
				arrays[i] = i;
				bool = true;
			} else {
				arrays[i] = -1;
			}
		}
		if (!bool) {
			System.out.println("������");
		}
		int first  =0;
		int last = 0;
		for (int i = 0; i < array.length; i++) {
			if(arrays[i]!=-1) {
				last = i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(arrays[i]!=-1) {
				first = i;
				break;
			}
		}
		System.out.println("��һ�γ���"+first+"���һ�γ���"+last);
	}
}
