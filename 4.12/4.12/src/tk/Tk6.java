package tk;

/*
 * ѭ���ṹ  ��ʵ���ǲ��for���ʽ�е�3������
 * ��ȷ��������ѭ��
 * ������ʼ��
 * while(���ʽ(����ѭ��������)){
 * 
 * 
 * �������
 * }
 */
public class Tk6 {
	public static void main(String[] args) {
		// 1 - 10
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		System.out.println("===============");
		// continue return
		for (int j = 1; j < 11; j++) {
			if (j == 4) {
				// break;//��������ѭ��
				// continue;// ���������ؼ��֣�����ѭ��������ֱ�ӿ�ʼ��һ��ѭ��
				// return;// ������ǰ����
			}
			System.out.println(j);
		}
		System.out.println("over");
	}
}
