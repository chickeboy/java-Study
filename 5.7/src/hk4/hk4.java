package hk4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*����һ���ַ������͵ļ��ϣ��������ѧ��������Ϣ ��Ŀ���Ƿ�ɹ��Ƿ���ڶ�Ҫ����ʾ
(1)��дһ���������ֶ�¼��5������
(2)��дһ��������ʹ����ͨforѭ�������������
(3)��дһ��������ʹ����ǿforѭ�������������
(4)��дһ��������ʹ�õ�����ѭ�������������
(5)��дһ����������������һ�����֣���ѯ�Ƿ����
(6)��дһ����������������һ�����֣���ʾ�������г��ֵĸ����֣�����3���������ʹ�ӡ��3��������
(7)��дһ����������������һ�����֣�����ɾ��������Ƿ�ɹ���Ĭ��Ψһ�ģ�
(8)��дһ����������������һ�����֣�ɾ�����ж�Ӧ������
(9)��дһ����������������һ�����֣���ȡ����������Զ�Ӧ���±�(Ĭ��Ψһ������)
(10)��дһ����������������һ�����֣���ȡ�����������Ӧ���±�(Ĭ���ظ���)�����Ҵ�ӡ��������±�
(11)��дһ������������һ�����ϣ������ż������ݣ�����������е����ݣ���ӵ�ԭ������
(12)��дһ������������һ�����ϣ������ż������ݣ�ɾ���������ϵĽ���
(13)��дһ������������һ�����ϣ������ż������ݣ���ȡ�������ϵĽ���
(14)��дһ��������ͨ������һ���Ƚ������Լ��Ͻ�������������򣺸������ֳ�������
(15)��дһ��������ͨ�������ڲ���Լ��Ͻ���������������ȸ������ֳ������򣬳�����ͬ�Ƚ��ֵ�˳��
(16)��дһ����������������һ������Ȼ���޸�������ֶ�Ӧ��λ�õ�ֵΪ��abc��
(17)��дһ��������ʹ��al.remove����ɾ��������������е�����
(18)��дһ���������������е�Ԫ�ش���������н��б����������Ҫ�ֶ����ƣ�*/
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		/*
		 * Scanner scanner = new Scanner(System.in); for (int i = 0; i < 5; i++) {
		 * String string = scanner.next(); arrayList.add(string); }
		 */
		// ��дһ���������ֶ�¼��5������(����ע�͵�)
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		// ��дһ��������ʹ����ͨforѭ�������������
		math1(arrayList);
		System.out.println("==============1=================");
		// ��дһ��������ʹ����ǿforѭ�������������
		math2(arrayList);
		System.out.println("==============2=================");
		// ��дһ��������ʹ�õ�����ѭ�������������
		math3(arrayList);
		System.out.println("==============3=================");
		// ��дһ����������������һ�����֣���ѯ�Ƿ����
		System.out.println(math4(arrayList));
		System.out.println("===============4================");
		// ��дһ����������������һ�����֣���ʾ�������г��ֵĸ����֣�����3���������ʹ�ӡ��3��������
		math5(arrayList);
		System.out.println("==============5=================");
		// ��дһ����������������һ�����֣�����ɾ��������Ƿ�ɹ���Ĭ��Ψһ�ģ�
		System.out.println(math6(arrayList));
		System.out.println("==============6=================");
		// ��дһ����������������һ�����֣�ɾ�����ж�Ӧ������
		math7(arrayList);
		System.out.println("=============7==================");
		// ��дһ����������������һ�����֣���ȡ����������Զ�Ӧ���±�(Ĭ��Ψһ������)
		int b = math8(arrayList);
		if (b != -1) {
			System.out.println(b);
		} else {
			System.out.println("û���ҵ�");
		}
		System.out.println("=============8==================");
		// ��дһ����������������һ�����֣���ȡ�����������Ӧ���±�(Ĭ���ظ���)�����Ҵ�ӡ��������±�
		math9(arrayList);
		System.out.println("=============9==================");
		// ��дһ������������һ�����ϣ������ż������ݣ�����������е����ݣ���ӵ�ԭ������
		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("aaa");
		arrayList2.add("ac");
		arrayList2.add("bba");
		arrayList2.add("cd");
		for (Iterator iterator = math10(arrayList, arrayList2).iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("============10===================");
		// (12)��дһ������������һ�����ϣ������ż������ݣ�ɾ���������ϵĽ���
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("aa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		for (Iterator iterator = math11(arrayList, arrayList2).iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("==============11=================");
		// ��дһ������������һ�����ϣ������ż������ݣ���ȡ�������ϵĽ���
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		for (Iterator iterator = math12(arrayList, arrayList2).iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("===============12================");
		arrayList.add("acc");
		arrayList.add("bbb");
		arrayList.add("caaaaa");
		arrayList.add("acbba");
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("bbb");
		// ��дһ��������ͨ������һ���Ƚ������Լ��Ͻ�������������򣺸������ֳ�������
		Compare2 compare2 = new Compare2();
		Collections.sort(arrayList,compare2);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("============13===================");
		// ͨ�������ڲ���Լ��Ͻ���������������ȸ������ֳ������򣬳�����ͬ�Ƚ��ֵ�˳��
		Comparator1 comparator1 = new Comparator1();
		Collections.sort(arrayList, comparator1);
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("==============14=================");
		// ��дһ����������������һ������Ȼ���޸�������ֶ�Ӧ��λ�õ�ֵΪ��abc��
		math14(arrayList);
		System.out.println("===============15================");
		// ��дһ��������ʹ��al.remove����ɾ��������������е�����
		math15(arrayList);
		System.out.println("==============16=================");
		//��дһ���������������е�Ԫ�ش���������н��б����������Ҫ�ֶ����ƣ�*/
		 Object array[] = math16(arrayList);
		for (Object object : array) {
			System.out.println(object);
		}
	}

	private static Object[]  math16(List<String> arrayList) {
		// TODO Auto-generated method stub
		return arrayList.toArray();
	}

	private static void math15(List<String> arrayList) {
		// TODO Auto-generated method stub
		// ��дһ��������ʹ��al.remove����ɾ��������������е�����
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "aaa";
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equals(str)) {
				// al.remove(string);
				iterator.remove();
			}
		}
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
	}

	private static void math14(List<String> arrayList) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "aaa";
		arrayList.add(arrayList.indexOf(str), "abc");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	private static void math13(List<String> arrayList) {
		// TODO Auto-generated method stub
		
	}

	private static List<String> math12(List<String> arrayList, List<String> arrayList2) {
		// ��дһ������������һ�����ϣ������ż������ݣ���ȡ�������ϵĽ���
		// TODO Auto-generated method stub
		arrayList.retainAll(arrayList2);
		return arrayList;
	}

	private static List<String> math11(List<String> arrayList, List<String> arrayList2) {
		// TODO Auto-generated method stub
		arrayList.removeAll(arrayList2);
		return arrayList;
	}

	private static List<String> math10(List<String> arrayList, List<String> arrayList2) {
		// TODO Auto-generated method stub
		// ��дһ������������һ�����ϣ������ż������ݣ�����������е����ݣ���ӵ�ԭ������
		arrayList.addAll(arrayList2);
		return arrayList;
	}

	private static void math9(List<String> arrayList) {
		// TODO Auto-generated method stub
		// ��дһ����������������һ�����֣���ȡ�����������Ӧ���±�(Ĭ���ظ���)�����Ҵ�ӡ��������±�
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "����";
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).equals(str)) {
				System.out.println(i);
			}
		}
	}

	private static int math8(List<String> arrayList) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "����";
		return arrayList.indexOf(str);
	}

	private static void math7(List<String> arrayList) {
		// TODO Auto-generated method stub
		// ��дһ����������������һ�����֣�ɾ�����ж�Ӧ������
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "aaa";
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equals(str)) {
				// al.remove(string);
				iterator.remove();
			}
		}
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
	}

	private static boolean math6(List<String> arrayList) {
		// TODO Auto-generated method stub
		// ��дһ����������������һ�����֣�����ɾ��������Ƿ�ɹ���Ĭ��Ψһ�ģ�
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "����";
		return arrayList.remove(str);
	}

	private static void math5(List<String> arrayList) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		String str = "����";
		//str = scanner.next();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (string.equals(str)) {
				System.out.println(string);
			}
		}

	}

	public static void math1(List<String> arrayList) {
		// ��дһ��������ʹ����ͨforѭ�������������
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

	public static void math2(List<String> arrayList) {
		// ��дһ��������ʹ����ǿforѭ�������������
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

	public static void math3(List<String> arrayList) {
		// ��дһ��������ʹ�õ�����ѭ�������������
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	public static boolean math4(List<String> arrayList) {
		// ��дһ����������������һ�����֣���ѯ�Ƿ����
		//Scanner scanner = new Scanner(System.in);
		//String string = scanner.next();
		String string = "aaa";
		if (arrayList.indexOf(string) != -1) {
			return true;
		} else {
			return false;
		}
	}
}
