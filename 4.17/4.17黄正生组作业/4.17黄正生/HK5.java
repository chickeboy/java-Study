import java.util.Scanner;

/*��һ�����У�8��4��2��1��23��344��12
ѭ��������е�ֵ
��������������ֵ�ĺ�
������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ����������*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {8,4,2,1,23,344,12};
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		int sum = 0;
		for(int i = 0;i<array.length;i++) {
			sum +=array[i];
		}
		System.out.println(sum);
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ҵ�����");
		int a = scanner.nextInt();
		boolean bool = false;
		for(int i = 0;i<array.length;i++) {
			if(a==array[i]) {
				bool = true;
			}
		}
		if(bool) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}

}
