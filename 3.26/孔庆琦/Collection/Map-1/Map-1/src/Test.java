import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		// 1.����50�������
		Random random = new Random();
		int[] array = new int[50];
		for (int i = 0; i < array.length; i++) {
			array[i] = 30 + random.nextInt(6);
		}
		// 2.���Լ��ıȽϹ�����map��
		int maxNum = 0;
		int maxCount = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>(new MyCompare());
		for (int i = 0; i < array.length; i++) {// �����array[i]���ֵ����֣�Ҳ����key��ֵ
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);// ���������ظ���key��ô�ͻ�ȡԭ�ȶ�Ӧ��ֵȻ��+1�ٸ�������key��Ӧ��ֵ
			} else {
				map.put(array[i], 1);// ��һ�γ��־���1��
			}
			if (maxCount < map.get(array[i])) {
				maxNum = array[i];
				maxCount = map.get(array[i]);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> en : entrySet) {
			System.out.println("����:" + en.getKey() + "...................������" + en.getValue() + "��");
		}
		System.out.println("===========================================");
		System.out.println("���ִ�������������............ " + maxNum + "������...................." + maxCount);
	}
}
