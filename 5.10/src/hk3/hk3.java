package hk3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hk3 {
	/*
	 * 3.����Student�࣬����String���͵�name��
	 * int���͵�age��double���͵�score��
	 * ����дgetter��setter�ȷ�����
	 * 2������5��Student����
	 * ��֪һ��Integer���͵�ѧ�Ŷ�ӦΨһ��һ��Student���� 3��
	 * ��5��Student���󱣴浽HashMap�����С�
	 * 4����������������ӡ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Student> hashMap = new HashMap<Integer, Student>();
		hashMap.put(1, new Student("����",34,38.1));
		hashMap.put(2, new Student("����",24,38.1));
		hashMap.put(3, new Student("����",15,38.1));
		hashMap.put(4, new Student("����",25,38.1));
		hashMap.put(5, new Student("����",34,38.1));
		Set<Entry<Integer,Student>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("====================================");
		}
	}

}
