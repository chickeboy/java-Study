package tk;

/*
 * ����:�洢���ݵ�����
 * �ص�:�洢�ռ��ַ��������,������ӵ���±꣨������
 * ��Ϊ�������±꣬�Ϳ������������ʣ���ͨ���±�
 * ֱ�ӿ��Է��ʵ���Ӧ��λ���ϴ洢�����ݣ�����Ҫͨ�����Ա���
 * �����Ǿ�̬�ģ�����ĳ���һ�������޷��ı�,����ÿ��λ�ö���
 * �̶���
 * ֻ�ܴ��ͬһ�������ͣ�һ�������������ʱ��ȷ������������
 * ���ܸı�
 */
public class Tk1 {
	public static void main(String[] args) {
		// �﷨ ��������[] ������ = {1,2,4,5} ��̬��ʼ��
		// ��̬��ʼ��:�ڶ����ʱ��ȷ��������ĳ��ȵ�ͬʱ
		// Ҳ�����˸�ֵ
		int[] array = { 1, 2, 4, 5 };// ��������͵�����
		// ����ĳ���Ϊ 4 ���һλ�� 3 ��������һλ���ǳ��� -1
		// ��̬��ʼ��,�����ֵҪ���ݳ����������ȷ��
		// �����ڶ�̬��ʼ����ʱ����븳�賤��
		int[] array2 = new int[10];
		System.out.println(array2.length);
		// array2.lengthֻ�ܱ�ʾ����ĳ��� ���ܴ����������м���Ԫ��
		// ��������Ƕ�̬��ʼ���Ļ����������û�и�ֵ��Ҳ����Ĭ��ֵ
		// int 0 String null double 0.0 boolean false char \u0000
		// ����ı�������0��λ��ʼѭ��ͨ���±����������ÿһ��λ��
		String[] ct = new String[5];
		for (int i = 0; i < ct.length; i++) {
			System.out.println(ct[i]);// ct������i��λ���ֵ
		}
	}
}