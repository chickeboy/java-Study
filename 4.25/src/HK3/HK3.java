package HK3;

/*��дJava����ģ��򵥵ļ�������
������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С�
��д���췽��������n1��n2��ʼֵ����Ϊ���ඨ��ӣ�addition��������subtration����
�ˣ�multiplication��������division���ȹ��г�Ա�������ֱ��������Ա����ִ�мӡ������ˡ��������㡣
��main�����д���Number��Ķ��󣬵��ø�������������ʾ�������������췽����*/
public class HK3 {
	public static void main(String[] args) {
		
		Number number = new Number(5, 6);
		System.out.println(number.addition());
		System.out.println(number.subtration());
		System.out.println(number.multiplication());
		System.out.println(number.division());
	}
	
}
