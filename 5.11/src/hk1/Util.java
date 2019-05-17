package hk1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Util {
	HashMap<Student, Score> hashMap;

	public Util(HashMap<Student, Score> hashMap) {
		super();
		this.hashMap = hashMap;
	}

	public Util() {
		super();
	}

	public void show() {
		Set<Entry<Student, Score>> entrySet = hashMap.entrySet();
		System.out.println("==================�������������Ϣ==================");
		for (Entry<Student, Score> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("=============================================");
		}
	}

	public void showbysex() {
		Set<Entry<Student, Score>> entrySet = hashMap.entrySet();
		System.out.println("==============�������������Ϣ====================");
		for (Entry<Student, Score> entry : entrySet) {
			if (entry.getKey().getSex().equals("��")) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				System.out.println("==========================================");
			}
		}
	}

	public void showbyhege(String string) {
		Set<Entry<Student, Score>> entrySet = hashMap.entrySet();
		System.out.println("==============" + string + "�ϸ����=====================================");
		// eng math chn
		switch (string) {
		case "eng":
			for (Entry<Student, Score> entry : entrySet) {
				if (entry.getValue().getEng() > 60) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
					System.out.println("=======================================");
				}
			}
			break;
		case "math":
			for (Entry<Student, Score> entry : entrySet) {
				if (entry.getValue().getMath() > 60) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
					System.out.println("=======================================");
				}
			}
			break;
		case "chn":
			for (Entry<Student, Score> entry : entrySet) {
				if (entry.getValue().getChn() > 60) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
					System.out.println("=======================================");
				}
			}
			break;

		default:
			break;
		}
	}

	public void showavg(String string, double avg) {
		System.out.println("=============" + string + "��ƽ������==============");
		System.out.println(avg);
	}

	public void showbyavg(List<Entry<Student, Score>> list) {
		Collections.sort(list, new Comparator<Entry<Student, Score>>() {

			@Override
			public int compare(Entry<Student, Score> o1, Entry<Student, Score> o2) {
				// TODO Auto-generated method stub
				if (o1.getValue().getAvg() > o2.getValue().getAvg()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		System.out.println("===========�����ܷ�����================");
		for (Entry<Student, Score> entry : list) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	public void showbycnn(List<Entry<Student, Score>> list) {
		Collections.sort(list, new Comparator<Entry<Student, Score>>() {

			@Override
			public int compare(Entry<Student, Score> o1, Entry<Student, Score> o2) {
				// TODO Auto-generated method stub
				if (o1.getValue().getChn() > o2.getValue().getChn()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		System.out.println("===========�������ĳɼ�����================");
		for (Entry<Student, Score> entry : list) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	public void showbyid(TreeMap<Student, Score> treeMap) {
		System.out.println("===========����id����========================");
		Set<Entry<Student,Score>> entrySet = treeMap.entrySet();
		for (Entry<Student, Score> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("====================================");
		}
	}
}
