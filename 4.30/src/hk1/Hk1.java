package hk1;

import java.util.Arrays;

/*
 * 1.Ҫ�����£�
 1��Person������߱��Ƚ�������ʵ��Comparable<T>�ӿڣ���
 �ȽϵĹ����ǡ������������������������������ͬ��
 ���������ֵ�˳�����򡱣�����Ӣ��������
 2��Ȼ��ͨ�������ڲ���ָ��һ�ֱȽ�����Comparator<T>����
 �ȽϹ����ǡ��������򡱡�
 3��дһ�������࣬����ArrayList<Person>���ϣ������5��Person����
 �ֱ����������ֱȽϹ���Ըü������򣬼�����������
 */
public class Hk1 {

	public static void main(String[] args) {
		Person[] personArray = { new Person("aa", 30), new Person("bb", 20),
				new Person("ab", 10), new Person("abc", 50),
				new Person("aa", 60) };
		Arrays.sort(personArray);
		for (Person person : personArray) {
			System.out.println(person);
		}
		System.out.println("==============");

		Arrays.sort(personArray,new CompareByScore());
		for (Person person : personArray) {
			System.out.println(person);
		}
	}

}
