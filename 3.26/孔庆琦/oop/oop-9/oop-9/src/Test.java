import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Person[] p = new Person[5];
		p[0] = new Person("aaaa", 100);
		p[1] = new Person("aaa", 23);
		p[2] = new Person("bbb", 44);
		p[3] = new Person("aab", 55);
		p[4] = new Person("avb", 88);
		// Arrays.sort��һ���涨�����Ǵ����������һ��Ҫ��Ҫ�������д�ŵĶ�����пɱ���
		// Ҫ��sort֪����Ŀɱ�����ʲô������ô��Ҫȥ�������д�ŵ�����ʵ��Comparable�ӿ�
		// �ṩ�Ĺ�����ķ������ܷ��㣬ֻ��Ҫ�������������ʾ�Ͳ����Ĺ涨�����ܵõ����Ľ��
		// �����sort������ʵ������Ҫ���ǵ�compareTo�ķ���ֵ
		Arrays.sort(p);
		for (Person person : p) {
			System.out.println(person);
		}
		MyCompare compare = new MyCompare();
		Arrays.sort(p, compare);// ���������أ�����һ���µıȽϹ��򸲸�ԭ�е�Person�Դ��ıȽϹ���
		System.out.println("========================");
		for (Person person : p) {
			System.out.println(person);
		}
	}
}
