import java.util.Scanner;

/*5.���ִ�֣��ڸ質�����У�����10λ��ί���д�֣��ڼ�����ֵ÷�ʱ��
ȥ��һ����߷֣�ȥ��һ����ͷ֣�Ȼ��ʣ���8λ��ί�ķ�������ƽ����
���Ǹ�ѡ�ֵ����յ÷֡�����ÿ����ί�����֣���ĳѡ�ֵĵ÷�*/
public class HK6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array[] = new double[10];
		
		double sum = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("�������" + (i + 1) + "����ί�ķ���");
			array[i] = scanner.nextDouble();
		}
		double max = array[0];
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
			sum += array[i];
		}
		System.out.println("ѡ�ֵĵ÷�Ϊ��" + (sum - max - min) / 8);
	}

}
