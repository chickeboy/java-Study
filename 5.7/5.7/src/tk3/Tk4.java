package tk3;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�Ĳ�ѯ�ͱ���
 */
public class Tk4 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al.get(0));// ͨ���±��ȡλ���ϵ�Ԫ��
		System.out.println(al.indexOf(0));// ͨ��Ԫ��ֵ��ȡ����һ�γ��ֵ�λ�õ��±�
		System.out.println(al.contains(4));// ��ѯһ��Ԫ��ʵ�ڴ����ڼ�����
		System.out.println(al.remove(new Integer(5)));
		// ���ϵı���
		System.out.println(al);
		// 1.��ͨforѭ��
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		// 2.for each
		for (Integer integer : al) {
			System.out.println(integer);
		}
		// 3.������ģʽ ���е�iterable�ӿڵ�ʵ���඼����iterator()����
		// �����ڷ��������ڲ���һ��ָ��
		System.out.println("===================");
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {// �Ƿ���һ��λ����Ԫ��
//			System.out.println(it.next());// ��������ȡ��һ��Ԫ��
//			if (it.next().equals(new Integer(4))) {
//				it.remove();
//			}
			Integer integer = it.next();
			System.out.println(integer);
//			if (integer.equals(new Integer(4))) {
//				it.remove();
//			}
		}
		System.out.println("===================");
		// ��������Ҫ����
		it = al.iterator();// ���»�ȡ�׵�ַ
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
