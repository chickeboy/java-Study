import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class setdemo {
	/*
	 * 1.����һ��HashSet ����ַ����� 
	 * (1)ѭ��¼��5�����ݣ��ظ������޷���ӣ�������ʾ 
	 * (2)��������һ���ַ�����ɾ������ַ�����������ʾ
	 * (3)��������һ���ַ�������ѯ���ַ����Ƿ�����ڼ����� 
	 * (4)��д2�ַ�ʽ�������� 
	 * (5)ͨ��2�ַ�ʽɾ��һ���ַ���
	 * (6)����һ��Integer���͵�ArrayList������30��0-10���������Ȼ��ʹ��HashSet���������ظ���Ԫ��ȡ������������
	 * (7)��HashSet�������򣬸���String����Ȼ˳��
	 */
	public static void main(String[] args) {
		String string;
		Set<String> set = new HashSet<String>();
		Scanner  scanner  = new Scanner(System.in);
		set.add("aa");
		set.add("bb");
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("������"); string =
		 * scanner.next(); if (set.add(string)) { System.out.println("����ɹ�"); }else {
		 * System.out.println("����ʧ��"); i--; } }
		 */
		System.out.println("������Ҫɾ�����ַ�");
		//string = scanner.next();
		string = "bb";
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string1 = (String) iterator.next();
			if (string1.equals(string)) {
				iterator.remove();
				System.out.println("ɾ���ɹ�");
			}else {
				System.out.println("ɾ��ʧ��");
			}
		}
		System.out.println(set.remove(string));
		System.out.println("������Ҫ���ҵ��ַ�");
		//string = scanner.next();
		string  = "aa";
		if (set.contains(string)) {
			System.out.println("�ܹ��ҵ�");
		} else {
			System.out.println("�����ҵ�");
		}
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string2 = (String) iterator.next();
			System.out.println(string2);
		}
		for (String string2 : set) {
			System.out.println(string2);
		}
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arrayList.add((int)Math.floor(Math.random()*10));
		}
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println("==================");
		Set<Integer> set2= new HashSet<Integer>();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (set2.add(integer)) {
				iterator.remove();
			}
		}
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
