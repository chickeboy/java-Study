package tk3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * ���Ͽ��
 * List  Set  Map
 * ͨ���������ݽṹ�������ݽ��д洢
 * Iterable �ӿڣ��������ӿڣ������������඼����
 * iterator()���� ����ʹ��for eachѭ��
 * Collection�ӽӿ�
 * List ���򼯺ϣ����У��ĸ��ӿ�
 * �ýӿ��µ�ʵ��������ʵ���ڴ��ַ�����������±꣨������
 * ����ͨ�������±�λ�ò��������е�����
 * ���Դ���ظ�����
 * List - > ArrayList��List��ʵ����
 * ArrayList:�ײ�ṹΪ���飬��ʵ���Ƕ������һ����װ�͹�������
 *  ����Ա������Ҫ�����ײ�����
 * 
 * 
 * 
 * 0  1  3
 */
public class Tk3 {
	public static void main(String[] args) {
		// ����һ�����String���͵�List��������
		ArrayList<String> al = new ArrayList<String>();
		// 1.������� ʵ�ֵ���β�巨
		al.add("a");
		al.add("b");
		al.add("a");
		System.out.println(al.size());// size()��ʾ����ʵ��Ԫ�ظ���
		al.add(0, "a");// ���ָ���±겻���������ģ������Ǻ�β���������±�ֵ������β��֮ǰ��λ��
		System.out.println(al);// ֱ�Ӵ�ӡ���ϱ����������Ǳ���
		System.out.println(al.remove(2));// ͨ���±�ɾ�����������λ�ñ�ɾ���ľ���Ԫ��ֵ
		System.out.println(al.remove("a"));// ԭ���Ǹ��ݴ���������͵�equals����
		System.out.println(al);
		al.set(0, "zzzzzzzzz");
		System.out.println(al);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		System.out.println(a.remove(new Integer(3)));
	}
}
