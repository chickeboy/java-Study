package hk1;

/* 1 4 10
 * 4.���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ�
 * ��������һ�룬����񫣬�ֶ����һ��������
 * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * �Ժ�ÿ�����϶�����ǰһ��ʣ�¡�����
 * ��һ����һ��������10���������ٳ�ʱ��
 * ��ֻʣ��һ�������ˡ����һ�칲ժ�˶���
 */
public class Hk4 {
	public static void main(String[] args) {
		int peach = 1;
		int day = 0;
		while (day < 9) {
			peach = (peach + 1) * 2;
			day++;
		}
		System.out.println(peach);
	}
}
